package com.Loops;

import java.util.Scanner;

//Count the factors of a number.
public class For30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}
