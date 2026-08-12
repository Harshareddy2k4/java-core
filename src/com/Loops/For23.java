package com.Loops;

import java.util.Scanner;

//Count numbers divisible by both 2 and 3.
public class For23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println("ENTER THE NUMBERS :");
			int b = sc.nextInt();
			if (b % 2 == 0 && b % 3 == 0) {
				count++;
			}
		}
		System.out.println("TOTAL COUNT OF NUMBERS WHICH ARE DIVISIBLE BY BOTH 2 AND 3 :" + count);
		sc.close();

	}

}
