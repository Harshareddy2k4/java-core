package com.javaintro;

public class Method1 {
	static {
		System.out.println("static block called");
		hello();
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Method1 met = new Method1();
		met.world();
		hello();
	}
	void world() {
		System.out.println("Instance method started");
	}
	static void hello(){
		System.out.println("Static method started");
	}
}
