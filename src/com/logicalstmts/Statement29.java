package com.logicalstmts;

//Check whether a person can donate blood (age and weight).
import java.util.Scanner;

public class Statement29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int a = sc.nextInt();
		System.out.println("enter weight :");
		double b = sc.nextDouble();
		if (a < 20 && b < 60 && a > 60) {
			System.out.println("you are not eligible");
		} else if (a > 50 && b > 70 && b < 80) {
			System.out.println("you are eligible");
		} else if (a > 40 && b > 65 && b < 80) {
			System.out.println("you are eligible for blood donation");
		} else if (a > 30 && b > 65 && b < 75) {
			System.out.println("YOu are eligible for blood donation");
		} else if (a >= 20 && b > 65 && b < 75) {
			System.out.println("you are eligible for blood donation");
		} else {
			System.out.println("you are not eligible for blood donation");
		}
		sc.close();
	}

}
