package com.Test;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a >= -9 && a <= 9) {
			System.out.println("its a single digit number");
		} else if (a >= -99 && a <= 99) {
			System.out.println("its a double digit number");
		} else if (a >= -999 && a <= 999) {
			System.out.println("its a triple digit number ");
		} else if (a >= -9999 && a <= 9999) {
			System.out.println("its a four digit number");
		} else {
			System.out.println("its out of range");
		}
		sc.close();
	}

}
