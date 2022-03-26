package com.rest.Student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.Student.Model.Student;
import com.rest.Student.Repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository studentrepository;
	
	
	  @GetMapping("/GetAllStudents")
	    public List<Student> getAllStudents() {
	        return studentrepository.findAll();
	    }
	  
	  @PostMapping("/AddStudent")
	    public Student AddStudent(@RequestBody Student student) {
	        return studentrepository.save(student);
	    }
	  
	  @GetMapping("/GetStudentById/{id}")
	    public Optional<Student> getStudentById(@PathVariable(value = "id") Long StudentId) {
	        return studentrepository.findById(StudentId);
	    }

	    @PutMapping("/UpdateStudent/{id}")
	    public Student updateStudent(@PathVariable(value = "id") Long StudentId,
	                                           @RequestBody Student StudentDetails) {
	    	Student updatedStudent = null;
	    	try {
	        Student Student = studentrepository.findById(StudentId) .orElseThrow(() -> new Exception());

	        Student.setStudent_name(StudentDetails.getStudent_name());
	        Student.setStudent_dob(StudentDetails.getStudent_dob());
	        Student.setStudent_doj(StudentDetails.getStudent_doj());

	         updatedStudent = studentrepository.save(Student);
	    	}
	        catch(Exception e) {
	        	
	        }
	        return updatedStudent;
	    }

	    @DeleteMapping("/DeleteStudent/{id}")
	    public Boolean deleteStudent(@PathVariable(value = "id") Long StudentId) {
	        
	        studentrepository.deleteById(StudentId);

	        return true;
	    }
	  

}
