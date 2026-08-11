package com.Test;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Ticket Type:");
		System.out.println("1. Silver - Rs.200");
		System.out.println("2. Gold - Rs.300");
		System.out.println("3. Platinum - Rs.500");
		System.out.println("4. Exit");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.print("Enter your age: ");
			int age1 = sc.nextInt();
			double silverPrice = 200;

			if (age1 >= 60) {
				silverPrice = silverPrice - (silverPrice * 0.10);
			}

			System.out.println("Silver Ticket Price: Rs." + silverPrice);
			break;

		case 2:
			System.out.print("Enter your age: ");
			int age2 = sc.nextInt();
			double goldPrice = 300;

			if (age2 >= 60) {
				goldPrice = goldPrice - (goldPrice * 0.10);
			}

			System.out.println("Gold Ticket Price: Rs." + goldPrice);
			break;

		case 3:
			System.out.print("Enter your age: ");
			int age3 = sc.nextInt();
			double platinumPrice = 500;

			if (age3 >= 60) {
				platinumPrice = platinumPrice - (platinumPrice * 0.10);
			}

			System.out.println("Platinum Ticket Price: Rs." + platinumPrice);
			break;

		case 4:
			System.out.println("Thank you! Visit Again.");
			break;

		default:
			System.out.println("Invalid Choice!");
		}

		sc.close();
	}
}
