package com.logicalstmts;

//Check if a number is a multiple of 7.
import java.util.Scanner;

public class Statement12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (7 % a == 0) {
			System.out.println("number is a multiple of 7");
		} else {
			System.out.println("number is not a multiple of 7");
		}
		sc.close();
	}

}
