package com.Loops;

import java.util.Scanner;

//palindrome number checking
public class For34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		System.out.println("ENTER AN NUMBER :");
		int a = sc.nextInt();
		int ori = a;
		for (; a != 0; a = a / 10) {
			int digi = a % 10;
			rev = rev * 10 + digi;

		}
		if (rev == ori) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT A PALINDROME");
		}
		sc.close();
	}

}
