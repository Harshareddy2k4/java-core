package com.langfund;

public class Rectangle {
 void method1() {
	int  perimeter = 0;
	int area = 0;
	 int length = 12;
	 int breadth = 153;
	 perimeter = 2*(length+breadth);
	 area = length*breadth;
	 System.out.println("perimeter of rectangle is :"+perimeter);
	 System.out.println("area of rectangle is :"+area);
 }	
 public static void main(String[] args) {
		System.out.println("main method started");
		Rectangle rec = new Rectangle();
		rec.method1();
	}

}
