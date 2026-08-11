package com.Test;

public class Test13 {
	int id;
	String name;
	String course;

	Test13(int id, String name, String course) {
		this.id=id;
		this.name = name;
		this.course = course;
	}

	Test13(int id, String name) {
		this(id,name,"jfs");
	}

	Test13(int id) {
		this(id,"harsha");
	}

	Test13() {
		this(101);
	}
	void show() {
		System.out.println("student id :"+id);
		System.out.println("student name :"+name);
		System.out.println("course :"+course);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test13 t = new Test13();
		t.show();
		
	}

}
