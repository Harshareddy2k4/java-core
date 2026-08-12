package com.Loops;
//Find the smallest number entered by the user.
import java.util.Scanner;

public class For17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest = 0;
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println("enter a num :");
			int b = sc.nextInt();
			if (b < i) {
				largest = b;
			}
		}
		System.out.println("SMALLEST NUMBER :" + largest);
		sc.close();

	}

}
