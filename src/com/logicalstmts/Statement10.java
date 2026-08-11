package com.logicalstmts;

//Check if a number is divisible by 10.
import java.util.Scanner;

public class Statement10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a % 10 == 0) {
			System.out.println("given number is multiple of 10");
		} else {
			System.out.println("given number is not a multiple of 10");
		}
		sc.close();
	}

}
