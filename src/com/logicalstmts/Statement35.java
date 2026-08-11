package com.logicalstmts;

//Check if the sum of two numbers is greater than 100.
import java.util.Scanner;

public class Statement35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number :");
		double a = sc.nextDouble();
		System.out.println("enter the second number :");
		double b = sc.nextDouble();
		if ((a + b) >= 100) {
			System.out.println("sum of two numbers is greater than 100");
		} else {
			System.out.println("sum of two numbers is not greater than 100 ");
		}
		sc.close();
	}

}
