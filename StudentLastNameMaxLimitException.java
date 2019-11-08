package com.wipro.student.exception;

public class StudentLastNameMaxLimitException extends Exception {
	@Override
	public String toString() {
		return "Student Last Name Maximum Limit Exceeded";
	}
}
