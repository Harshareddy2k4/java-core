package com.logicalstmts;
//Find the smallest of three numbers.
import java.util.Scanner;

public class Statement21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number :");
		double a = sc.nextDouble();
		System.out.println("enter the second number :");
		double b = sc.nextDouble();
		System.out.println("enter the third number :");
		double c = sc.nextDouble();
		if (a < b && a < c) {
			System.out.println("first number is smallest");
		} else if (b < a && b < c) {
			System.out.println("second number is smallest");
		} else {
			System.out.println("third number is smallest");
		}
		sc.close();

	}

}
