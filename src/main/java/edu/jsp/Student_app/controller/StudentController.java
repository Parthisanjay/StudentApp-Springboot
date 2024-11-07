package edu.jsp.Student_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Student_app.dto.Student;
import edu.jsp.Student_app.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("savestudent")
	public Student saveStudent(@RequestBody Student s) {
		 
		return studentservice.saveStudent(s);
	}
	
	@GetMapping("fetchbyid")
	public Student fetchStudentById(@RequestParam int id) {
		
		return studentservice.fetchStudentById(id);
	}
	
	@GetMapping("fetchall")
	public List<Student> fetchAll(){
		
		return studentservice.fetchAll();	
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable int id) {
		
		return studentservice.deleteById(id);
	}
	
	@GetMapping("fetchbyname")
	public Student findByName(@RequestParam String name) {
		
		return studentservice.findByName(name);
	}
}
