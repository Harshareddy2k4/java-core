package com.Method1;

public class Constructor3 {
	String car;
	String model;
	String fuel;
	String color;
	double price;
	Constructor3(String car,String model){
		this.car = car;
		this.model = model;
	}
	Constructor3(Constructor3 c,String fuel){
		this(c.car,c.model);
		this.fuel = fuel;
	}
	Constructor3(Constructor3 c1,String color,double price){
		this(c1.car,c1.model);
		this.fuel = c1.fuel;
		this.color = color;
		this.price = price;
	}
	void show() {
		System.out.println("Car brand :"+car);
		System.out.println("Car model :"+model);
		System.out.println("fuel type"+fuel);
		System.out.println("color of the car :"+color);
		System.out.println("price of the car :"+price);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor3 c = new Constructor3("BMW","M4 competetion");
		Constructor3 c1 = new Constructor3(c,"petrol");
		Constructor3 c2 = new Constructor3(c1,"Black",20000000);
		c2.show();

	}

}
