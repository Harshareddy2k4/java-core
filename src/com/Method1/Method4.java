package com.Method1;

import java.util.Scanner;

public class Method4 {

	void add(double a, double b) {
		System.out.println("addition :" + (a + b));
	}

	void sub(double a, double b) {

		System.out.println("Subract :" + (a - b));
	}

	void multiply(double a, double b) {

		System.out.println("Subract :" + a * b);
	}

	void div(double a, double b) {

		System.out.println("Subract :" + a % b);
	}

	void division(double a, double b) {

		System.out.println("Subract :" + a / b);
	}

	void main(String[] args) {
		System.out.println("Hello main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double a = sc.nextDouble();
		System.out.println("enter a number 2 :");
		double b = sc.nextDouble();
		add(a, b);
		sub(a, b);
		multiply(a, b);
		div(a, b);
		division(a, b);
	}

}
