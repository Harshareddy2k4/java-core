package com.Loops;
//sum of prime numbers from given range
import java.util.Scanner;

public class For36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE RANGE FROM :");
		int a = sc.nextInt();
		System.out.println("ENTER THE RANGE TO :");
		int b = sc.nextInt();
		boolean prime;
		int sum = 0;
		for (int i = a; i < b; i++) {
			prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				sum += i;
				System.out.print(i+" ");
			}
		}
		System.out.println("SUM OF PRIME NUMBERS FROM GIVEN RANGE :" + sum);
		sc.close();
	}

}
