package edu.jsp.Student_app.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.Student_app.dto.Student;
import edu.jsp.Student_app.repository.StudentRepo;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepo studentrepo;
	
	public Student saveStudent(Student s) {
		
		return studentrepo.save(s);
	}
	
	public Student fetchStudentById(int id) {
		
		Optional <Student> o= studentrepo.findById(id);
		
		return o.get();
	}
	
	public List<Student> fetchAll(){
		
		return studentrepo.findAll();
	}
	
	public String deleteById(int id) {
		
		studentrepo.deleteById(id);
		
		return "Deleted";
	}
	
	public Student findByName(String name) {
		
		Optional<Student> o= studentrepo.findByName(name);
		
		return o.get();
	}
	
	public Student updateStudent(Student s) {
		
		return studentrepo.save(s);
	}
}
