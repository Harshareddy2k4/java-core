package com.Method1;

import java.util.Scanner;

public class Method7 {
	void convertCel(double a) {
		System.out.println("after coverting to celcius :" + (a - 273));
	}

	void convertfar(double a) {
		System.out.println("after converting to farenhieat :" + (a + 273));
	}

	void convertMin(int b) {
		System.out.println("After converting to minutes" + b * 60);
	}

	void convertCurr(double c) {
		System.out.println("after converting dollars to rupees :" + c * 89);
	}

	public static void main(String[] args) {
		System.out.println("welcome to methods");
		Scanner sc = new Scanner(System.in);
		Method7 m = new Method7();
		System.out.println("Enter a number which you want to covert :");
		double a = sc.nextDouble();
		System.out.println("enter how many hours you want convert to minutes :");
		int b = sc.nextInt();
		System.out.println("enter how many dollars you want to convert to rupees :");
		double c = sc.nextDouble();
		m.convertCel(a);
		m.convertfar(a);
		m.convertMin(b);
		m.convertCurr(c);
	}

}
