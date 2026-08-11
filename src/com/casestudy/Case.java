package com.casestudy;

//bonus eligibility
import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter employee performance rating out of 5 :");
			double a = sc.nextDouble();
			boolean b = (a >= 4 && a <= 5) ? true : false;
			System.out.println("Bonus eligibility status :" + b);
			System.out.println("Do you want to check another employee performance rating (Y/N):");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		System.out.println("Thank you !!!!");
		sc.close();
	}

}
