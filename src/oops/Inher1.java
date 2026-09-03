package oops;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
}

class Student extends Person {
	String college;

	Student(String college, String name, int age) {
		super(name, age);
		this.college = college;
		System.out.println(college);
	}
}

public class Inher1 {

	public static void main(String[] args) {
		Student s = new Student("SMEC", "HARSHA", 22);

	}

}
