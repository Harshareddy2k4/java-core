package com.Loops;
//Find the sum of numbers from 1 to N.
import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("ENTER A NUM :");
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			sum += i;
		}
		System.out.println("TOTAL SUM :" + sum);
		sc.close();
	}

}
