package com.Loops;

import java.util.Scanner;

public class For39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");// 822
		int a = sc.nextInt();
		int temp = 0;
		for (; a != 0; a = a / 10) {
			int digit = a % 10;
			if (digit > temp) {
				temp = digit;
			}
		}
		System.out.println("LARGEST DIGIT IS :" + temp);
		sc.close();

	}

}
