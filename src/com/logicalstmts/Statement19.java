package com.logicalstmts;

//Check if a number is a two-digit number.
import java.util.Scanner;

public class Statement19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a >= -10 && a <= 99 && a >= 10 && a <= 99) {
			System.out.println("number is a two-digit numbe");
		} else {
			System.out.println("number is not a two-digit numbe");
		}
		sc.close();
	}

}
