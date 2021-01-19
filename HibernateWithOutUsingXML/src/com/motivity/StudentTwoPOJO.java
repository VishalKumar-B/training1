package com.motivity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studenttwo")
public class StudentTwoPOJO {

	@Id
	@Column(name = "sid")
	private int student_id;

	@Column(name = "sname")
	private String student_name;

	@Column(name = "smarks")
	private int student_marks;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_marks() {
		return student_marks;
	}

	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}
}
