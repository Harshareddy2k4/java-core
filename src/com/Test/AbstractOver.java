package com.Test;

abstract class Shape {
	void area() {
		System.out.println("ABSTRACT CLASS AREA");
	}
}

class Rectangle extends Shape {
	@Override
	void area() {
		System.out.println("RECTANGLE CLASS AREA");
	}
}

class Circle extends Shape {
	@Override
	void area() {
		System.out.println("CIRCLE CLASS AREA");
	}
}

public class AbstractOver {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle();
		s.area();
		s = new Circle();
		s.area();

	}

}
