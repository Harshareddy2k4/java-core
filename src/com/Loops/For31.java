package com.Loops;

import java.util.Scanner;

//Check whether a number is prime.
public class For31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("ITS A PRIME ");
		} else {
			System.out.println("IT IS NOT A PRIME");
		}
		sc.close();
	}
}
