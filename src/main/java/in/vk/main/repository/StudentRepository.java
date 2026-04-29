package in.vk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.entities.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{
	
	

}
