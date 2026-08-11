package com.logicalstmts;

import java.util.Scanner;

public class Nested4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to HBI");
		System.out.println("How can we help you? :");
		String a = sc.nextLine();
		if (a.equalsIgnoreCase("Loan request") || a.equalsIgnoreCase("Loan") || a.equalsIgnoreCase("i want loan")) {
			System.out.println("Do you requested for loan (yes/no):");
			String b = sc.next();
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("Whats your age :");
				int c = sc.nextInt();
				if (c >= 22 && c <= 65) {
					System.out.println("How much money you earn every month :");
					double d = sc.nextDouble();
					if (d >= 40000) {
						System.out.println("what is your credit score :");
						double e = sc.nextDouble();
						if (e >= 750 && e < 1000) {
							System.out.println("Are you verified your documents properly(yes/no) :");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("will you able to pay intrest every month properly (yes/no) :");
								String g = sc.next();
								if (g.equalsIgnoreCase("yes")) {
									System.out.println("sir/madam your loan is approved thank you");
								} else {
									System.out.println("sorry sir/madam we wont give the loan soo thank you ");
								}
							} else {
								System.out.println("we need to verify your documents");
							}
						} else {
							System.out.println("sorry sir/madam your credit score is too less ");
						}
					} else {
						System.out.println("you are unable to pay the loan soo sorry sir ");
					}
				} else {
					System.out.println("we wont give loan to kids and old age people");
				}
			} else {
				System.out.println("you have to send me the request first");
			}
		} else {
			System.out.println("soory sir those things we dont do here");
		}
		System.out.println("thanks for visiting !!!!");
		sc.close();
	}

}
