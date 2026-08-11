package com.logicalstmts;

import java.util.Scanner;

//Find the smaller of two numbers.
public class Statement8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number :");
		double a = sc.nextDouble();
		System.out.println("enter second number :");
		double b = sc.nextDouble();
		if(a<b) {
			System.out.println("first number is smaller");
		}else if (b<a) {
			System.out.println("second number is smaller");
		}else {
			System.out.println("both are equal");
		}
		sc.close();
	}

}
