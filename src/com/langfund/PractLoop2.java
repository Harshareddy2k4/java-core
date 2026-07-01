package com.langfund;

import java.util.Scanner;

//Count the number of digits in a number
public class PractLoop2 {

	public static void main(String[] args) {
		System.out.println("Number of digits");
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.println("Enetr a number :");
		int num = sc.nextInt();
		for (;num!=0;num=num/10) {
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
