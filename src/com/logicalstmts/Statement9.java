package com.logicalstmts;

import java.util.Scanner;

//Check if a number is divisible by 5.
public class Statement9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a % 5 == 0) {
			System.out.println("given number is multiple of 5");
		} else {
			System.out.println("entered number is not multiple of 5");
		}
		sc.close();
	}

}
