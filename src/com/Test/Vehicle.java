package com.Test;

public class Vehicle {
	String a = "r15";
	double b = 100000;
	int c = 1;

	Vehicle() {
		System.out.println("no arg constructor called");
	}
	{
		System.out.println("instance block called");
	}
	Vehicle(String a, double b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Car b = new Car();
		b.show();
	}
}

class Car extends Vehicle {
	Car() {
		super();
		System.out.println("bike method called");
	}

}
