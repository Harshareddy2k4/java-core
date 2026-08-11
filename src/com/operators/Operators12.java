package com.operators;

import java.util.Scanner;

public class Operators12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double d = sc.nextDouble();
		System.out.println("enter second number :");
		double d1 = sc.nextDouble();
		System.out.println("enter operator :");
		String s = sc.next();
		String result = (s.equals("+")) ? String.valueOf(d + d1)
				: (s.equals("-")) ? String.valueOf(d - d1)
						: (s.equals("*")) ? String.valueOf(d * d1)
								: (s.equals("%")) ? String.valueOf(d % d1)
										: (s.equals("/")) ? String.valueOf(d / d1) : "Not valid";
		System.out.println(result);

	}

}
