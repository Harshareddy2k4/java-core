package com.Method1;

public class Constructor4 {
	String college;
	String university;
	String department;
	String location;
	double fee;
	int strength;

	Constructor4(String college, String university) {
		this.college = college;
		this.university = university;
	}

	Constructor4(Constructor4 c, String department, int strength) {
		this(c.college, c.university);
		this.department = department;
		this.strength = strength;
	}

	Constructor4(Constructor4 c1, double fee) {
		this(c1.college, c1.university);
		this.department = c1.department;
		this.strength = c1.strength;
		this.fee = fee;
	}

	Constructor4(Constructor4 c2, String location) {
		this(c2.college, c2.university);
		this.department = c2.department;
		this.strength = c2.strength;
		this.fee = c2.fee;
		this.location = location;
	}

	void show() {
		System.out.println("College name :" + college);
		System.out.println("University under :" + university);
		System.out.println("department :" + department);
		System.out.println("fee :" + fee);
		System.out.println("Student strength :" + strength);
		System.out.println("college location :" + location);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor4 c = new Constructor4("St Martins", "JNTUH");
		Constructor4 c1 = new Constructor4(c, "Artificial Intelligence", 70);
		Constructor4 c2 = new Constructor4(c1, 700000);
		Constructor4 c3 = new Constructor4(c2, "dhulapally");
		c3.show();

	}

}
