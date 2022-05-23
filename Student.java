package com.masai;

import java.util.Scanner;

public class Student {

	private int rollNumber;
    private String studentName;
    private int marks;
    
    Student(){
    	
    	
    	
    }
    Student(int rollNumber , String studentName, int marks ){
    	
    	this.rollNumber = rollNumber;
    	this.studentName = studentName;
    	this.marks = marks;
    }
    
    
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
    
    
	static class Main{
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("How many Student you want to add");
			int sNum = in.nextInt();
			
			System.out.println("Enter roll Number");
			int sroll = in.nextInt();
			in.nextLine();
			System.out.println("Enter Student Name");
			String sname = in.nextLine();
			
			System.out.println("Enter marks");
			int smarks = in.nextInt();
			
			
			Student s1 = new Student(sroll,sname,smarks);
//			s1.Student(sroll,sname,smarks);
			
			
			   
	   System.out.println("Student roll Number :"+s1.getRollNumber());  
	    System.out.println("Student Name :"+ s1.getStudentName());
	   System.out.println("Student Marks :" + s1.getMarks());

		}
	}


	
}
