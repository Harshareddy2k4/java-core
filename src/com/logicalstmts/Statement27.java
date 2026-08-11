package com.logicalstmts;

//Check whether a number is divisible by 2, 3, and 5.
import java.util.Scanner;

public class Statement27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a % 2 == 0 && a % 3 == 0 && a % 5 == 0) {
			System.out.println("number is divisible by 2, 3, and 5");
		} else {
			System.out.println("number is not divisible by 2, 3, and 5");
		}
		sc.close();

	}

}
