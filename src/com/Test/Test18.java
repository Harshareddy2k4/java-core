package com.Test;

public class Test18 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = b+a;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
		a = a^b;
		b = b^a;
		a = b^a;
		System.out.println(a);
		System.out.println(b);

	}

}
