package com.langfund;

import java.util.Scanner;

public class PractLoop1 {

	public static void main(String[] args) {
		System.out.println("For Loop");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for(int num=2;num<=n;num++) {
			boolean prime = true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					prime =false;
					break;
				}
			}
			if(prime) {
			System.out.println(num);
			sum=sum+num;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
