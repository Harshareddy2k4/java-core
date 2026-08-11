package com.operators;

import java.util.Scanner;
//Check if a number is zero or non-zero.
public class Operators9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		String b = (a==0)?"Num is Zero":"Num is non zero";
		System.out.println(b);
	}

}
