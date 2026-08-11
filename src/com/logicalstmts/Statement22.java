package com.logicalstmts;

//Check whether three sides form a triangle.
import java.util.Scanner;

public class Statement22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first side :");
		double a = sc.nextDouble();
		System.out.println("eneter the second side :");
		double b = sc.nextDouble();
		System.out.println("enter the third side :");
		double c = sc.nextDouble();
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("given sides can form a triangle");
		} else {
			System.out.println("cannot form a triangle");
		}
		sc.close();

	}

}
