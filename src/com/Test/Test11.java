package com.Test;

import java.util.Scanner;

public class Test11 {
	String a;
	int b;
	double c;
	double d;

	Test11(String a, int b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	void show() {
		double bill = c * d;
		System.out.println("---  patient details ---");
		System.out.println("patient name :" + a);
		System.out.println("patient age :" + b);
		System.out.println("room charges per day :" + c);
		System.out.println("number of days stayed :" + d);
		System.out.println("total bill :" + bill);
	}

	public static void main(String[] args) {
		System.out.println("welcome to main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter patient name :");
		String a = sc.nextLine();
		System.out.println("enetr age :");
		int b = sc.nextInt();
		System.out.println("enter room charges per day :");
		double c = sc.nextDouble();
		System.out.println("number of days admitted :");
		int d = sc.nextInt();
		Test11 t = new Test11(a, b, c, d);
		t.show();
	}

}
