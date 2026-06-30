package com.javaintro;
//instance variables
public class Student {
	int StudentId;
	String StudentName;
	String Address;
	int age;
	public static void main(String[] args) {
		System.out.println("Student Details");
	Student st = new Student();
	st.StudentId = 44;
	st.StudentName = "HARSHA";
	st.Address = "35/7";
	st.age = 22;
	System.out.println("StudentId is :"+st.StudentId);
	System.out.println("Student Name is :"+st.StudentName);
	System.out.println("Student Address is :"+st.Address);
	System.out.println("Student age is :"+st.age);
	System.out.println("Student2 Details");
	Student st1 = new Student();
	st1.StudentId = 42;
	st1.StudentName = "ABHINAV";
	st1.Address = "35/6";
	st1.age = 22;
	System.out.println("StudentId is :"+st1.StudentId);
	System.out.println("Student Name is :"+st1.StudentName);
	System.out.println("Student Address is :"+st1.Address);
	System.out.println("Student age is :"+st1.age);

	}

}
