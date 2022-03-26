package com.rest.Student.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long student_no;
	String student_name;
	Date student_dob;
	Date student_doj;
	
	public Student() {
		
	}
	
	
	public Student(Long student_no, String student_name, Date student_dob, Date student_doj) {
		super();
		this.student_no = student_no;
		this.student_name = student_name;
		this.student_dob = student_dob;
		this.student_doj = student_doj;
	}
	
	public Long getStudent_no() {
		return student_no;
	}
	public void setStudent_no(Long student_no) {
		this.student_no = student_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Date getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}
	public Date getStudent_doj() {
		return student_doj;
	}
	public void setStudent_doj(Date student_doj) {
		this.student_doj = student_doj;
	}
	
	

}
