package com.Test;

public class Test16 {
	String a;
	long b;
	double c;

	Test16() {
		this("unkonwn");
	}

	Test16(String a) {
		this(a,0);
	}

	Test16(String a,long b) {
		this(a,b,0.0);
	}

	Test16(String a,long b,double c) {
		this.a =a;
		this.b=b;
		this.c=c;
	}
	void show() {
		System.out.println("***********************");
		System.out.println("account holder name :"+a);
		System.out.println("account number :"+b);
		System.out.println("account balance :"+c);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test16 t3 =new Test16();
		t3.show();
		Test16 t = new Test16("Krishna",0,0.0);
		t.show();
		Test16 t1 = new Test16("Krishna",101001001,0);
		t1.show();
		Test16 t2 = new Test16("Krishna",101001001,100000.00);
		t2.show();

	}

}
