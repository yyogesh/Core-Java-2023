package com.ysquare.SpringJDBCExample;

import com.ysquare.SpringJDBCExample.model.Student;
import com.ysquare.SpringJDBCExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExampleApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setName("Test");
		student.setMarks(89);
		student.setRollNo(1);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);
	}
}
