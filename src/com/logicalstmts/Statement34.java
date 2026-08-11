package com.logicalstmts;

//Check if the last digit is 5.
import java.util.Scanner;

public class Statement34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double a = sc.nextDouble();
		if (a % 10 == 5) {
			System.out.println("last digit is 5");
		} else {
			System.out.println("last digit is not 5");
		}
		sc.close();
	}

}
