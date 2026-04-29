package in.vk.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.vk.main.entities.Student;
import in.vk.main.services.StudentServices;
import in.vk.main.services.Studnetserviceimpl;

@SpringBootApplication
public class SpringbootJpAprojectApplication {

	public static void main(String[] args) {
		
	ApplicationContext config=	  SpringApplication.run(SpringbootJpAprojectApplication.class, args);
 StudentServices stdserv =	config.getBean(Studnetserviceimpl.class);
 
 //------Insertion operation------
// Student std = new  Student();
//// std.setId(1);
// std.setName("suraj");
// std.setMarks(88.8f);
// std.setRollno(45);
// boolean status= stdserv.addstudentdetails(std);
// if(status) {
//	 System.out.println("sucessfully");
// }else {
//	 System.out.println(" not sucessfully");
// }
 
 //------select operation---
// List<Student> std= stdserv.getalldetails();
// for(Student s:std) {
//	 System.out.println(s.getId());
//	 System.out.println(s.getMarks());
//	 System.out.println(s.getName());
//	 System.out.println(s.getRollno());
// }
 
 
 //------select perticular id ---
// 
// Student std=stdserv.getdeatils(1l);
// if(std !=null) {
//	
//		 System.out.println(std.getId());
//		 System.out.println(std.getMarks());
//		 System.out.println(std.getName());
//		 System.out.println(std.getRollno());
//	 
// }else{
//	       System.out.println("not fond");
//      }
 
 // ------- update operation---
// boolean status= stdserv.updatedetails(1l, 90.0f);
// if(status) {
//	 System.out.println("sucessfully updated");
// }else {
//	 System.out.println("not updated");
// }
 
 //----delete operation
   boolean status= stdserv.delete(2);
   if(status) {
	   System.out.println("deleted sucessfully");
   }else {
	   System.out.println("not deleted");
   }
 
 
	}

}
