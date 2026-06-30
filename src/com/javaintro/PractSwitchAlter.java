package com.javaintro;

import java.util.Scanner;

public class PractSwitchAlter {

	public static void main(String[] args) {
		System.out.println("DAYSSSSS");
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		switch(num) {
		case 1 -> System.out.println("sunday");
		case 2 -> System.out.println("monday");
		case 3 -> System.out.println("tuesday");
		case 4 -> System.out.println("wednsday");
		case 5 -> System.out.println("thursday");
		case 6 -> System.out.println("friday");
		case 7 -> System.out.println("saturday");
		default -> System.out.println("Sakkaga Enter Chey Beteee");
		}
		
		System.out.println("Do You Want to enter again (y/n)");
		choice = sc.next();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("program ended");
		sc.close();
		

	}
}
