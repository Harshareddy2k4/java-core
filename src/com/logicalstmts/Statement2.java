package com.logicalstmts;

import java.util.Scanner;

//Check if a number is zero.
public class Statement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a == 0) {
			System.out.println("number is zero");
		} else {
			System.out.println("its not a zero");
		}
		sc.close();
	}

}
