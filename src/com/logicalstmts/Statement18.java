package com.logicalstmts;

//Check if a number is a single-digit number.
import java.util.Scanner;

public class Statement18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double a = sc.nextDouble();
		if (a >= -9 && a <= 9) {
			System.out.println("Number is a single-digit number");
		} else {
			System.out.println("Number is a multi-digit number");
		}
		sc.close();
	}

}
