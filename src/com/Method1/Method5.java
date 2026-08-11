package com.Method1;

import java.util.Scanner;

public class Method5 {
	void tel(int a) {
		System.out.println("telugu marks :" + a);
	}

	void hin(int b) {
		System.out.println("telugu marks :" + b);
	}

	void eng(int c) {
		System.out.println("telugu marks :" + c);
	}

	void math(int d) {
		System.out.println("telugu marks :" + d);
	}

	void bio(int e) {
		System.out.println("telugu marks :" + e);
	}

	void phy(int f) {
		System.out.println("telugu marks :" + f);
	}

	void soci(int g) {
		System.out.println("telugu marks :" + g);
	}

	public static void main(String[] args) {
		System.out.println("welcome to main method ");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		Method5 m = new Method5();
		System.out.println("enter telugu marks :");
		int a = sc.nextInt();
		System.out.println("enter hindi marks :");
		int b = sc.nextInt();
		System.out.println("enter english marks :");
		int c = sc.nextInt();
		System.out.println("enter maths marks :");
		int d = sc.nextInt();
		System.out.println("enter biology marks :");
		int e = sc.nextInt();
		System.out.println("enter physics marks :");
		int f = sc.nextInt();
		System.out.println("enter social marks :");
		int g = sc.nextInt();
		int percent = 0;
		m.tel(a);
		m.hin(b);
		m.eng(c);
		m.math(d);
		m.bio(e);
		m.phy(f);
		m.soci(g);
		sum = sum + (a + b + c + d + e + f + g);
		System.out.println("total marks :" + sum);
		percent = (sum * 100) / 700;
		System.out.println("total percentage is :" + percent);
	}
}
