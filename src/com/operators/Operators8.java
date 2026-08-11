package com.operators;

import java.util.Scanner;

public class Operators8 {
//	Check if a number is a multiple of 10
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		String b = (a%10==0)?"Multiple of 10":"Not Multiple of 10";
		System.out.println(b);
	}

}
