package com.Loops;

import java.util.Scanner;

//PRIME NUMBERS
public class For28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			boolean prime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
