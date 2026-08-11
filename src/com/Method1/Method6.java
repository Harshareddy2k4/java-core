package com.Method1;

import java.util.Scanner;

public class Method6 {
	void findDiffer(double a, double b) {
		System.out.println("difference is :" + (a - b));
	}

	void findSmallest(double a, double b) {
		if (a < b) {
			System.out.println("first number is smallest");
		} else if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("second number is smallest number");
		}
	}

	void checkEqual(double a, double b) {
		if (a == b) {
			System.out.println("these two numbers are equal");
		} else {
			System.out.println("these two numbers are not equal");
		}
	}

	void avgNumber(double a, double b) {
		System.out.println("average of two numbers are :" + (a + b) / 2);
	}

	void findMax(double a, double b) {
		if (a > b) {
			System.out.println("first number is largest");
		} else if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("second number is largest number");
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to main method");
		Scanner sc = new Scanner(System.in);
		Method6 m = new Method6();
		System.out.println("Enter a number :");
		double a = sc.nextDouble();
		System.out.println("Enter the second number :");
		double b = sc.nextDouble();
		m.findDiffer(a, b);
		m.findSmallest(a, b);
		m.checkEqual(a, b);
		m.avgNumber(a, b);
		m.findMax(a, b);
		sc.close();
	}

}
