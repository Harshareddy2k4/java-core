package oops;

import java.util.Scanner;

class Student11 {
	String name;
	int marks;

	void calGrade(int marks) {
		if (marks >= 80 && marks <= 100) {
			System.out.println("A+");
		} else if (marks >= 60 && marks <= 79) {
			System.out.println("B+");
		} else if (marks >= 35 && marks < 60) {
			System.out.println("C+");
		} else {
			System.out.println("FAIL");
		}
	}
}

class Engineer extends Student11 {
	@Override
	void calGrade(int marks) {
		if (marks >= 80 && marks <= 100) {
			System.out.println("A+");
		} else if (marks >= 60 && marks <= 79) {
			System.out.println("B+");
		} else if (marks >= 35 && marks < 60) {
			System.out.println("C+");
		} else {
			System.out.println("FAIL");
		}
	}

}

class Medical extends Student11 {
	@Override
	void calGrade(int marks) {
		if (marks >= 80 && marks <= 100) {
			System.out.println("A+");
		} else if (marks >= 60 && marks <= 79) {
			System.out.println("B+");
		} else if (marks >= 35 && marks < 60) {
			System.out.println("C+");
		} else {
			System.out.println("FAIL");
		}
	}

}

class Management extends Student11 {
	@Override
	void calGrade(int marks) {
		if (marks >= 80 && marks <= 100) {
			System.out.println("A+");
		} else if (marks >= 60 && marks <= 79) {
			System.out.println("B+");
		} else if (marks >= 35 && marks < 60) {
			System.out.println("C+");
		} else {
			System.out.println("FAIL");
		}
	}
}

public class College {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER MARKS :");
		int marks = sc.nextInt();
		System.out.println("ENTER THE CHOICE :");
		choice = sc.nextInt();
		switch (choice) {
		case 1 -> {
			Student11 s = new Engineer();
			s.calGrade(marks);
		}
		case 2 -> {
			Student11 t = new Medical();
			t.calGrade(marks);
		}
		case 3 -> {
			Student11 u = new Management();
			u.calGrade(marks);
		}
		default -> System.out.println("INVALID");
		}
		sc.close();
	}

}
