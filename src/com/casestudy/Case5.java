package com.casestudy;

class Employee {
	int speed = 10;
	void work() {
		System.out.println("PATIENTS NI SMAPESTHAM !!!");
	}
	void run() {
		System.out.println("run11");
	}
}

class Doctor extends Employee {
	@Override
	void work() {
		System.out.println("THE KILLER !!!");
	}
	@Override
	void run() {
		System.out.println("run");
		System.out.println(speed);
	}
}

class Nurse extends Employee {
	@Override
	void work() {
		System.out.println("WEAPONS SUPPLIER !!!");
	}
}

class Receptionist extends Employee {
	@Override
	void work() {
		System.out.println("CHOOSES THE PERSON TO BE KILLED !!!");
	}
}

public class Case5 {

	public static void main(String[] args) {
		Employee e ;
		e = new Doctor();
		
		e.work();
		e = new Nurse();
		e.work();
		e = new Receptionist();
		e.work();
		

	}

}
