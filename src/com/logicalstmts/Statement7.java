package com.logicalstmts;

import java.util.Scanner;

//Find the greater of two numbers.
public class Statement7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double a = sc.nextDouble();
		System.out.println("enter a second number :");
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println("First number is greater");
		} else if (b > a) {
			System.out.println("Second number is greater");
		} else {
			System.out.println("Both are equal");
		}
		sc.close();
	}

}
