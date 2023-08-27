package com.training.functional;

public class EmployeeVO {
	
	private String fName;
	private String lName;
	private int age;
	
	public EmployeeVO() {
		super();
	}
	
	public EmployeeVO(Employee e) {
		this.setfName(e.getFirstName());
		this.setlName(e.getLastName());
		this.setAge(e.getAge());
	}
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
	
	
	

}
