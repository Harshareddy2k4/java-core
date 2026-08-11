package com.logicalstmts;

import java.util.Scanner;

//Check if a number is even or odd.
public class Statement3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("its a even number");
		} else {
			System.out.println("its a odd number");
		}
		sc.close();
	}

}
