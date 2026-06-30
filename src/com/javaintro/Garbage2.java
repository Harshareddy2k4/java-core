package com.javaintro;

public class Garbage2 {
	 class A {
		   B b;
		}

		class B {
		   A a;
		}

	 void main(String[] args) {
			       A obj1 = new A();
			       B obj2 = new B();

			       obj1.b = obj2;
			       obj2.a = obj1;

			       obj1 = null;
			       obj2 = null;
	}

}
