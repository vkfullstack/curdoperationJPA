package in.vk.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vk.main.entities.Student;
import in.vk.main.repository.StudentRepository;
@Service
public class Studnetserviceimpl implements StudentServices {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean addstudentdetails(Student std) {
		boolean st =false;
		try {
			 studentRepository.save(std);
			 st=true;
		}catch (Exception e) {
			e.printStackTrace();
			st=false;
		}
		
		return st;
	}

	@Override
	public List<Student> getalldetails() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getdeatils(long id) {
	    Optional<Student> optional = studentRepository.findById(id);

	    if (optional.isPresent()) {
	        return optional.get();
	    } else {
	        return null;
	    }
	}

	@Override
	public boolean updatedetails(long id, float marks) {
		 Student st=getdeatils(id);
		 if(st != null) {
			 st.setMarks(marks);
			 studentRepository.save(st);
			 return true;
		 }
		return false;
	}
	@Override
	public boolean delete(long id) {    
	    boolean status = false;

	    try {
	        studentRepository.deleteById(id);
	        status = true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        status = false;
	    }

	    return status;
	}

}



	


