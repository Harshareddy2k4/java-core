package com.operators;

import java.util.Scanner;

//Check if a person's age is eligible to vote (18+).
public class Operators10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = sc.nextInt();
		String b = (a>=18)?"Eligible for voting":"Not Eligible for voting ";
		System.out.println(b);

	}

}
