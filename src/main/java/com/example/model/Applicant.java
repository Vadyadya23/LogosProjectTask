package com.example.model;

public class Applicant {
    private String firstName;
    private String lastName;
    private String faculty;
	public String getFirstName() {
		return firstName;
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
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", faculty=" + faculty + "]";
	}
	public int getScores() {
		// TODO Auto-generated method stub
		return 0;
	}

    
}

