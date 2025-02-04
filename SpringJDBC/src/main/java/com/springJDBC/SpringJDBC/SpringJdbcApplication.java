package com.springJDBC.SpringJDBC;

import com.springJDBC.SpringJDBC.model.Student;
import com.springJDBC.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);


		Student s = context.getBean(Student.class);
		s.setRollNo(107);
		s.setName("Reddy");
		s.setMarks(90);


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}


}
