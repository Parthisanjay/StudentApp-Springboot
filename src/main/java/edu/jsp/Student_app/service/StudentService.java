package edu.jsp.Student_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Student_app.dao.StudentDao;
import edu.jsp.Student_app.dto.Student;



@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentdao;
	
	public Student saveStudent(Student s) {
		
		return studentdao.saveStudent(s);
	}
	
	public Student fetchStudentById(int id) {
		
		return studentdao.fetchStudentById(id);
	}
	
	public List<Student> fetchAll(){
		
		return studentdao.fetchAll();
	}
	
	public String deleteById(int id) {
		
		return studentdao.deleteById(id);
	}
	
	public Student findByName(String name) {
		
		return studentdao.findByName(name);
	}
	
	public Student updateStudent(int id,Student s) {
		
		return studentdao.updateStudent(s);
	}
}
