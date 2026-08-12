package com.Loops;

import java.util.Scanner;

//Count how many odd numbers exist from 1 to N.
public class For12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println("NUMBER OF ODD NUMBERS ARE :" + count);
		sc.close();
	}

}
