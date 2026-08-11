package com.casestudy;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		double d = 0;
		double d1 = 0;
		System.out.println("WELCOME TO THE BANK");
		double bal = 10000;
		do {
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAWN");
			System.out.println("CHOOSE AN OPTION WHICH YOU WANT TO DO");
			int a = sc.nextInt();
			switch (a) {
			case 1 -> {
				System.out.println("ENTER HOW MUCH YOU WANT TO DEPOSIT :");
				d = sc.nextDouble();
				bal += d;
			}
			case 2 -> {
				System.out.println("ENTER HOW MUCH AMOUNT YOU WANT TO WITHDRAWL ");
				d1 = sc.nextDouble();
				if (bal > d1) {
					bal -= d1;
				} else {
					System.out.println("INSUFFICIENT BALANCE");
				}
			}
			}
			System.out.println("DO WANT TO CONTINUE (Y/N) : ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("THANK YOU !!!");
		System.out.println("BALANCE IN ACCOUNT :" + bal);
		System.out.println("DEPOSITED AMOUNT :" + d);
		System.out.println("WITHDRAWN AMOUNT :" + d1);
		sc.close();
	}

}
