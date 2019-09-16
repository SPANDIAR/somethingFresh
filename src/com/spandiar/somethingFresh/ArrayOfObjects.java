package com.spandiar.somethingFresh;

public class ArrayOfObjects {
	
	private int rollNo;
	private String name;
	static int studentCount=0;

	public ArrayOfObjects() {
		// TODO Auto-generated constructor stub
		ArrayOfObjects.studentCount++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] studentNames = {"Manju", "Harish", "Kudi","Ravee","Lakshmi","Maman","Shekar"};
		ArrayOfObjects[] student = new ArrayOfObjects[25];
		
		
		for (int i=0;i<studentNames.length;i++) {
			
			student[i] = new ArrayOfObjects();
			student[i].rollNo = i;
			student[i].name = studentNames[i];
			System.out.println("Student ID: " + student[i].rollNo + " Name: " + student[i].name);
		}
		System.out.println("No of students in the class is: " + ArrayOfObjects.studentCount);
	}

}
