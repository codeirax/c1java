package com.masai;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println("Course id: " + courseId);
		System.out.println("Course fee: " + courseFee);
		System.out.println("Course Name: " + courseName);
	}
	
	
	static void authenticate(String username, String password ){
		if(username == "Admin" && password == "1234") {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter Course Id");
			int enteredCid = in.nextInt();
			
			in.nextLine();
			System.out.println("Enter Course Name");
			String enteredCname = in.nextLine();
			
			System.out.println("Enter Course Fee");
			int enteredCfee = in.nextInt();
			
			Course details = new Course();
			
			details.courseId = enteredCid;
			details.courseName = enteredCname;
			details.courseFee = enteredCfee;
			
			details.displayCourseDetails();
			
		}
		else {
			System.out.println("Invalid User Name and Password");
		}
		
	}
	
	
	
	public static void main(String[] args) {
	  new Course();
		
	   Course.authenticate("Admin", "1234");  // Calling with valid args
	   System.out.println("---------------------------------");
	   Course.authenticate("different", "password"); // Calling with invalid args.

	}
}
