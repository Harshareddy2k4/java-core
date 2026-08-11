package com.Test;

public class Test15 {
	String a;
	int b;
	int c;

	Test15() {
		this("BIOLOGY");
	}

	Test15(String a) {
		this(a,10);
	}

	Test15(String a,int b) {
		this(a,b,60);
	}

	Test15(String a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void show() {
		int total = b*c;
		System.out.println("subject is:"+a);
		System.out.println("total questions :"+b);
		System.out.println("time limit in minutes :"+c);
	}
	public static void main(String[] args) {
		Test15 t = new Test15();
		t.show();
	}

}
