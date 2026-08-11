package com.Test;

public class Test17 {
	int id;
	String name;
	double salary;
	Test17(int id,String name,double salary){
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	Test17(Test17 t, String name){
		this.id = t.id;
		this.name = name;
		this.salary= t.salary+10000;
	}
	void show() {
		System.out.println("employee Id :"+id);
		System.out.println("employee name :"+name);
		System.out.println("employee salary :"+salary);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Test17 t = new Test17(101,"harsha",50000);
		t.show();
		Test17 t1 = new Test17(t,"abhi");
		t1.show();
	}

}
