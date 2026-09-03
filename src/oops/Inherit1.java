package oops;
class Vehicle11{
	void display() {
		int speed =50;
		System.out.println(speed);
	}
}
class Car11 extends Vehicle11{
	@Override
	void display() {
		int speed = 100;
		System.out.println(speed);
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		Vehicle11 c = new Car11();
		c.display();
	}

}
