package com.operators;

import java.util.Scanner;

public class Operators13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		double d = sc.nextDouble();
		System.out.println("enter second number :");
		double d1 = sc.nextDouble();
		System.out.println("enter operator :");
		String s = sc.next();
		double result = (s.equals("+")) ?(d + d1)
				: (s.equals("-")) ?(d - d1)
						: (s.equals("*")) ?(d * d1)
								: (s.equals("%")) ?(d % d1)
										: (s.equals("/")) ?(d / d1) :69;
		System.out.println(result);

	}

}
