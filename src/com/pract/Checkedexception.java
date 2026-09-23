package com.pract;

import java.util.Scanner;

public class Checkedexception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String name = "";
		double marks;
		while (true) {

			try {
				System.out.println("ENTER A NUMBER :");
				num = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("INPUT DOESNT MATCH THE DATA TYPE SO TRY AGAIN :");
				sc.nextLine();
			}
		}
		while (name.trim().isEmpty()) {
			System.out.print("Enter your name: ");
			name = sc.nextLine();

			if (name.trim().isEmpty()) {
				System.out.println("Name cannot be empty. Try again.");
			}
		}
		while (true) {
			try {
				System.out.println("ENTER A MARKS :");
				marks = sc.nextDouble();

				break;
			} catch (Exception e) {
				System.out.println("INPUT DOESNT MATCH THE DATA TYPE SO TRY AGAIN :");
				sc.nextLine();
			}
		}
		System.out.println(name);
		System.out.println(num);
		System.out.println(marks);
		sc.close();
	}

}
