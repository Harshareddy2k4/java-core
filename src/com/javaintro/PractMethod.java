package com.javaintro;
//methods
public class PractMethod {
	 static void hello() {
		System.out.println("hello static method");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		PractMethod mthd = new PractMethod();
		hello();
		mthd.instance();
	}
	void instance() {
		System.out.println("hello instance method");
		hello();
	}
}
