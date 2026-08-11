package com.Test;

public class Test12 {
	int id;
	String name;
	String course;

	Test12() {
		this(101);
	}

	Test12(int id) {
		this(id,"harsha");
	}

	Test12(int id, String name) {
		this(id,name,"jfs");
	}

	Test12(int id, String name, String course) {
		this.id=id;
		this.name = name;
		this.course = course;
	}
	void show() {
		System.out.println("student id :"+id);
		System.out.println("student name :"+name);
		System.out.println("course :"+course);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test12 t = new Test12();
		t.show();

	}

}
