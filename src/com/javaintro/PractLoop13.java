package com.javaintro;

import java.util.Scanner;

public class PractLoop13 {
	static void factor(int num) {
		int sum = 0;
		for(int i=2;i<=num;i++) {
			boolean prime = true;
			for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				 prime=false;
				 break;
			}
			}
			 if (prime) {
	                sum += i;
	            }
			
		}
		 System.out.println("sum of prime numbers :"+sum);
	}

	public static void main(String[] args) {
		System.out.println("sum of prime numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		factor(n);
		sc.close();
	}
}
