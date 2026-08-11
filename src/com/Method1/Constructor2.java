package com.Method1;

public class Constructor2 {
	String name;
	int age;
	String disease;
	String doctor;
	int room;
	Constructor2(String name,int age){
		this.name = name;
		this.age = age ;
	}
	Constructor2(Constructor2 c,String disease,String doctor){
		this(c.name,c.age);
		this.disease = disease;
		this.doctor = doctor;
	}
	Constructor2(Constructor2 c1,int room){
		this(c1.name,c1.age);
		this.disease = c1.disease;
		this.doctor = c1.doctor;
		this.room = room;
	}
	void show() {
		System.out.println("Patient name :"+name);
		System.out.println("patient age :"+age);
		System.out.println("disease :"+disease);
		System.out.println("patient's doctor :"+doctor);
		System.out.println("patient's room number :"+room);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor2 c = new Constructor2("abhi",22);
		Constructor2 c1 = new Constructor2(c,"doubts","Harsha");
		Constructor2 c2 = new Constructor2(c1,69);
		c2.show();
	}

}
