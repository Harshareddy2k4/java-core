package oops;

class car {
	void start() {
		System.out.println("HELLO");
	}
}

class ferrari extends car {
	void end() {
		System.out.println("WORLD");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		car c = new car();

		ferrari f = new ferrari();
		f.start();
		f.end();

	}

}
