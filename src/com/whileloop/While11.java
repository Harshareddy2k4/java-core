package com.whileloop;

import java.util.Scanner;

//Find sum of digits
public class While11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a = a / 10;
		}
		System.out.println("TOTAL SUM OF DIGITS :" + sum);
		sc.close();
	}

}
