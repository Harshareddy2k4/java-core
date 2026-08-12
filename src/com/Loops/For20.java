package com.Loops;

import java.util.Scanner;

//Count zeros.
public class For20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		for (; a != 0; a = a / 10) {
			if (a % 10 == 0) {
				count++;
			}
		}
		System.out.println("TOTAL ZERO'S COUNT :" + count);
		sc.close();

	}

}
