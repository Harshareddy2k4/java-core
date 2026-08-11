package com.logicalstmts;

//Check whether a triangle is equilateral.
import java.util.Scanner;

public class Statement23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a side length :");
		double a = sc.nextDouble();
		System.out.println("enter second side length :");
		double b = sc.nextDouble();
		System.out.println("enter the third side :");
		double c = sc.nextDouble();
		if (a == b && b == c) {
			System.out.println("its a equilateral triangle");
		} else {
			System.out.println("its not a equilateral triangle");
		}
		sc.close();
	}

}
