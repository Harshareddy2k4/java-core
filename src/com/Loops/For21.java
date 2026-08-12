package com.Loops;

import java.util.Scanner;

//Find the average of N numbers.
public class For21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double average = 0;
		double sum = 0;
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println("ENTER THE NUMBERS :");
			double b = sc.nextDouble();
			sum+=b;
		}
		average = sum/a;
		System.out.println("TOTAL AVERAGE OF GIVEN NUMBERS IS :" + average);
		sc.close();
	}

}
