package com.Test;

import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double bal = 10000;
		double totalDeposited = 0;
		double totalWithdrawn = 0;

		int count = 1;

		System.out.println("WELCOME TO THE BANK");

		do {
			System.out.println("\nTRANSACTION " + count);
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAW");
			System.out.println("CHOOSE AN OPTION:");

			int a = sc.nextInt();

			switch (a) {

			case 1 -> {
				System.out.println("ENTER HOW MUCH YOU WANT TO DEPOSIT:");
				double amount = sc.nextDouble();

				bal += amount;
				totalDeposited += amount;
			}

			case 2 -> {
				System.out.println("ENTER HOW MUCH YOU WANT TO WITHDRAW:");
				double amount = sc.nextDouble();

				if (bal >= amount) {
					bal -= amount;
					totalWithdrawn += amount;
				} else {
					System.out.println("INSUFFICIENT BALANCE");
				}
			}

			default -> System.out.println("INVALID OPTION");
			}

			count++;

		} while (count <= 5);

		System.out.println("\nTHANK YOU !!!");
		System.out.println("FINAL BALANCE     : " + bal);
		System.out.println("TOTAL DEPOSITED   : " + totalDeposited);
		System.out.println("TOTAL WITHDRAWN   : " + totalWithdrawn);

		sc.close();
	}
}