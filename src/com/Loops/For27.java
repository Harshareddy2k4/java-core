package com.Loops;

import java.util.Scanner;

public class For27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lar = 0;
		int temp;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		for (; a != 0; a = a / 10) {
			temp = a % 10;
			if (temp > lar) {
				lar = temp;
			}
		}
		System.out.println("lar :" + lar);
		sc.close();
	}
}
