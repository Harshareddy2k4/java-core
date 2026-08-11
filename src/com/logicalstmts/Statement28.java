package com.logicalstmts;

//Find the largest among four numbers.
import java.util.Scanner;

public class Statement28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number :");
		double a = sc.nextDouble();
		System.out.println("enter second number :");
		double b = sc.nextDouble();
		System.out.println("enter third number :");
		double c = sc.nextDouble();
		System.out.println("enter fourth number :");
		double d = sc.nextDouble();
		if (a > d && a > b && a > c) {
			System.out.println("first number is greater");
		} else if (b > a && b > c && b > d) {
			System.out.println("second number is greater");
		} else if (c > a && c > b && c > d) {
			System.out.println("third number is greater");
		} else {
			System.out.println("fourth number is greater");
		}
		sc.close();
	}

}
