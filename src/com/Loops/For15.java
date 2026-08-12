package com.Loops;
//Find the sum of odd numbers from 1 to N.
import java.util.Scanner;

public class For15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("SUM OF EVEN NUMBERS ARE :" + sum);
		sc.close();

	}

}
