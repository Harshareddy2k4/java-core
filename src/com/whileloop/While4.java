package com.whileloop;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("ENTER A NUMBER :");
			int a = sc.nextInt();
			int rem = 0;
			int sum = 0;
			while (a > 9) {
				sum = 0;
				while (a > 0) {
					rem = a % 10;
					sum += rem;
					a = a / 10;
				}
				a = sum;
			}
			if (a == 1) {
				System.out.println("ITS MAGIC");
			} else {
				System.out.println("ITS NOT");
			}
			System.out.println("DO YOU WANT TO CHECK OTHER NUMBER(y/n) :");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("THANK YOU");
		sc.close();
	}

}
