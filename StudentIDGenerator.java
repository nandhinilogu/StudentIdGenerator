package com.wipro.student.service;
import com.wipro.student.exception.*;
import com.wipro.student.basic.Student;

public class StudentIDGenerator {
	public static boolean validateStudentDetails(Student studentObject){
		if(studentObject.getFirstName().length()<=20){
		return true;
		}
		if(studentObject.getFirstName().length()<=25){
			return true;
		}
		if((studentObject.getGender().equalsIgnoreCase("Male")) ||(studentObject.getGender().equalsIgnoreCase("Female")) ){
			return true;
		}
		if(studentObject.getYearOfBirth()<=studentObject.getYearOfBirth()+3){
			return true;
		}
		return false;	
	}
	public static String generateStudentID(Student student){
		String str=" ";
		str=str+student.getFirstName().substring(0, 2);
		str=str+student.getLastName().substring(0);
		str=str+student.getGender().substring(0);
		String YOB=String.valueOf(student.getYearOfBirth());
		str=str+YOB.substring(2, 4);
		str=str+"35";
		return str;
	}
	
}