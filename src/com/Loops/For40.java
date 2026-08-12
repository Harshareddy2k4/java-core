package com.Loops;

import java.util.Scanner;
//SECOND HIGHEST DIGIT COUNT
public class For40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");// 72629
		int a = sc.nextInt();
		int temp = 0;
		int sec = 0;
		for (; a != 0; a = a / 10) {
			int digit = a % 10;
			if (digit > temp) {
				sec = temp;
				temp = digit;

			} else if (digit > sec && digit != temp) {
				sec = digit;
			}

		}
		System.out.println(sec);
		sc.close();

	}

}
