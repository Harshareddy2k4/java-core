package com.Loops;

import java.util.Scanner;

//Find the product of numbers from 1 to N (factorial).
public class For7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		for (int i = a; i >= 1; i--) {
			sum *= i;
		}
		System.out.println("FACTORIAL OF GIVEN NUMBER IS :" + sum);
		sc.close();
	}

}
