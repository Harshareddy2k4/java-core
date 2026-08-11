package com.Test;

import java.util.Scanner;

public class Test7 {
	void salarySlip(String a, double b) {
		double hra = b * 0.2;
		double da = b * 0.1;
		double total = (b + hra + da);
		System.out.println("employee name is :" + a);
		System.out.println("employee salary is :" + b);
		System.out.println("employee HRA is :" + hra);
		System.out.println("employee DA is :" + da);
		System.out.println("total salary is  :" + total);
	}

	public static void main(String[] args) {
		System.out.println("Employee salary details");
		Scanner sc = new Scanner(System.in);
		Test7 t = new Test7();
		System.out.println("enter employee name :");
		String a = sc.nextLine();
		System.out.println("enter employee salary:");
		double b = sc.nextDouble();
		t.salarySlip(a, b);

	}

}
