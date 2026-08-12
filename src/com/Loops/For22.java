package com.Loops;

import java.util.Scanner;

//Count numbers divisible by 5.
public class For22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println("ENTER THE NUMBERS :");
			int b = sc.nextInt();
			if (b % 5 == 0) {
				count++;
			}
		}
		System.out.println("TOTAL COUNT OF NUMBERS WHICH ARE DIVISIBLE BY 5 :" + count);
		sc.close();

	}

}
