package com.pract;

public class Student2i {

	public static void main(String[] args) {

		Student2 s = new Student2();

		s.addItem(500);
		s.addItem(300);
		s.addItem(200);

		s.removeItem(300);

		s.getTotal();
	}
}
