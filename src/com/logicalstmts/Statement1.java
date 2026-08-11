package com.logicalstmts;

import java.util.Scanner;

//Check if a number is positive.
public class Statement1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if(a>=0) {
			System.out.println("Its a positive number");
		}else {
			System.out.println("its not a positive number");
		}
		sc.close();
	}

}
