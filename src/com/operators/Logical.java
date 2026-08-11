package com.operators;

public class Logical {

	public static void main(String[] args) {
		System.out.println("Welcome to Logical Operators");
		int a = 45;
		int b = 69;
		int c = 45;
		System.out.println("logical && operator");
		System.out.println(a>b&&b<c);
		System.out.println(a<b&&b>c);
		System.out.println(a==c&&a>b);
		System.out.println(a<b&&a<c);
		System.out.println("logical || Operator");
		System.out.println(a>b||b<c);
		System.out.println(a<b||b>c);
		System.out.println(a==c||a>b);
		System.out.println(a<b||a<c);
	}

}
