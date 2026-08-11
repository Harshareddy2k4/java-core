package com.Test;

public class Test14 {
	String a;
	double b;
	int c;

	Test14(String a, double b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	Test14(String a, double b) {
		this(a, b, 4);
	}

	Test14(String a) {
		this(a, 10000.00);
	}

	Test14() {
		this("vivo");
	}

	void show() {
		double price = b * c;
		System.out.println("----order details----");
		System.out.println("name of the product :" + a);
		System.out.println("price of the product :" + b);
		System.out.println("quantity of the product :" + c);
		System.out.println("total bill :" + price);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test14 t = new Test14();
		t.show();
	}

}
