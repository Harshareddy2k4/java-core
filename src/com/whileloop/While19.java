package com.whileloop;

import java.util.Scanner;

//Find largest and smallest digit
public class While19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int largest = 0;
		int smallest = 0;
		while (a > 0) {
			int rem = a % 10;
			if (largest < rem) {
				largest = rem;
			} else if (largest > rem) {
				smallest = rem;
			}
			a = a / 10;
		}
		System.out.println(smallest);
		System.out.println(largest);
		sc.close();

	}

}
