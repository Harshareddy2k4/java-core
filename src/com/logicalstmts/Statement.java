package com.logicalstmts;

import java.util.Scanner;

//Check if a number is negative.
public class Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("Its a negative number");
		} else {
			System.out.println("its  not a negative number");
		}
		sc.close();
	}

}
