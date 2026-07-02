package com.langfund;

import java.util.Scanner;

public class PractLoop5 {

	public static void main(String[] args) {
		System.out.println("Armstrong number ");
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int original = n;
		for(; n!=0;n = n/10) {
			int num =n%10;
			sum=sum+(num*num*num);
		}
			if(original == sum) {
				System.out.println("its a armstrong number");
			}else {
				System.out.println("its is not a armstrong");
			}
	}

}
