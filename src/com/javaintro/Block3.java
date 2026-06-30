package com.javaintro;
//Employee block
public class Block3 {
	static String CompanyName;
	static String Location;
	String EmployeeName;
	int Salary;
	static {
		 CompanyName = "Vcube";
		 Location = "36/1,kphb";
		
	}
	public static void main(String[] args) {
		System.out.println("Employee Details");
		System.out.println("Employee1 Details*******");
		Block3 emp = new Block3();
		emp. EmployeeName = "Harsha";
		emp. Salary = 2000000;
		System.out.println("Company name is :"+CompanyName);
		System.out.println("Location is :"+Location);
		System.out.println("Empoyee name is :"+emp.EmployeeName);
		System.out.println("Salary is :"+emp.Salary);
		System.out.println("Employee2 Details*******");
		Block3 emp1 = new Block3();
		emp1. EmployeeName = "Vishuuuu";
		emp1. Salary = 1000000;
		System.out.println("Company name is :"+CompanyName);
		System.out.println("Location is :"+Location);
		System.out.println("Empoyee name is :"+emp.EmployeeName);
		System.out.println("Salary is :"+emp.Salary);
		
	}

}
