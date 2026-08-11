package com.logicalstmts;

//Check if the product of two numbers is even.
import java.util.Scanner;

public class Statement36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		System.out.println("enter second number :");
		int b = sc.nextInt();
		if (a * b % 2 == 0) {
			System.out.println("product of two numbers is even");
		} else {
			System.out.println("product of two numbers is odd");
		}
		sc.close();
	}

}
