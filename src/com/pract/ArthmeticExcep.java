package com.pract;

import java.util.Scanner;

public class ArthmeticExcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("ENTER A NUMBER :");
			String a = sc.next();
			System.out.println("ENTER ANOTHER NUMBER :");
			String b = sc.next();
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			System.out.println(a1 / b1);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main method ended");
		sc.close();
	}

}
