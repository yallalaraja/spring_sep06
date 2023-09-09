package com.qedge.sep06.model;

public class Student {
	private String stuId;
	private String firstName;
	private String lastName;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getFirstName() {
		return firstName;
	}
	public Student() {
		super();
	}
	public Student(String stuId, String firstName, String lastName) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student(String stuId, String firstName) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
