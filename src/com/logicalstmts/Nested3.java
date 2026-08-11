package com.logicalstmts;

//employee promotion
import java.util.Scanner;

public class Nested3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Is this employee permanant(yes/no):");
			String a = sc.next();
			if (a.equalsIgnoreCase("yes")) {
				System.out.println("ok that's great!! ");
				System.out.println("attendance of employee :");
				double b = sc.nextDouble();
				if (b >= 90 && b <= 100) {
					System.out.println("that's great again");
					System.out.println("Rating of this employee out of 5 :");
					double c = sc.nextDouble();
					if (c >= 4 && c <= 5) {
						System.out.println("workholic aa?");
						System.out.println("Is there any disciplinary actions on this employee(yes/no):");
						String d = sc.next();
						if (d.equalsIgnoreCase("no")) {
							System.out.println("that's good to hear");
							System.out.println("Is this employee panctual(yes/no) :");
							String e = sc.next();
							if (e.equalsIgnoreCase("yes")) {
								System.out.println("congratulations you are eligible for bonus");
								System.out.println("what do you do with that bonus in one word :");
								String f = sc.next();
								if (f.equalsIgnoreCase(f)) {
									System.out.println("that's great thank you ");
								} else {
									System.out.println("thats great thank you!!");
								}
							} else {
								System.out.println("next time try chey mama");
							}
						} else {
							System.out.println("sry someone is better than you");
						}
					} else {
						System.out.println("not eligible ");
					}
				} else {
					System.out.println("employee is not eligible");
				}
			} else {
				System.out.println("he/she is not eligible");
			}
			System.out.println("do you want to check another employee? (y/n):");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("thank you !!!!");
		sc.close();
	}

}
