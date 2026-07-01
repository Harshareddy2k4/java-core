package com.langfund;

import java.util.Scanner;
//Find the largest digit in a number
public class PractLoop3 {

	public static void main(String[] args) {
		System.out.println("Largest number");
		Scanner sc = new Scanner(System.in);
		int largest =0;
		System.out.println("enetr a number:");
		int n = sc.nextInt();
		for(; n!=0; n=n/10) {
			int digit =n%10;
			if(digit>largest) {
				largest = digit;
			}
		}
		System.out.println(largest);
	}

}
