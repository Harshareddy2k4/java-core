package com.logicalstmts;

//Check whether a number is within the range 1–100.
import java.util.Scanner;

public class Statement25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double a = sc.nextDouble();
		if (a > 0 && a < 101) {
			System.out.println("given number is within the range 1–100");
		} else {
			System.out.println("given number is not within the range 1–100");
		}
		sc.close();

	}

}
