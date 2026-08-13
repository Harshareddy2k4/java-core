package com.Test;

import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER HOW MANY PRIME NUMBERS YOU WANT:");
		int a = sc.nextInt();

		boolean prime = true;
		int i = 2;
		int count = 0;

		while (i >= 2 && count < a) {

			prime = true;
			int j = 2;

			while (j < i) {

				if (i % j == 0) {
					prime = false;
					break;
				}

				j++;
			}

			if (prime) {
				System.out.println(i);
				count++;
			}

			i++;
		}

		sc.close();
	}
}
