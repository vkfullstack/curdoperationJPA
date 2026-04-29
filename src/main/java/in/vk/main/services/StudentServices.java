package in.vk.main.services;

import java.util.List;

import in.vk.main.entities.Student;

public interface StudentServices  {
	public  boolean addstudentdetails(Student std);
	public List<Student> getalldetails();
	public Student getdeatils(long id);
	public boolean updatedetails(long id,float marks);
	public boolean delete(long id);


}
