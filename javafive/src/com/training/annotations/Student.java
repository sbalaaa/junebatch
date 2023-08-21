package com.training.annotations;

@Report
public class Student {
	
	@Report
	int studentId;
	
	@Report
	Student() {
		
	}

	@Report
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	

}
