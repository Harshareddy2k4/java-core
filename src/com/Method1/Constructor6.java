package com.Method1;

public class Constructor6 {
	String movie;
	String name;
	String theatre;
	int seat;
	double price;
	String location;
	Constructor6(Constructor6 c2,String location){
		this(c2.movie,c2.name);
		this.theatre= c2.theatre;
		this.seat = c2.seat;
		this.price = c2.price;
		this.location = location;
		
	}
	Constructor6(Constructor6 c1,double price){
		this(c1.movie,c1.name);
		this.theatre= c1.theatre;
		this.seat = c1.seat;
		this.price = price;
	}
	Constructor6(Constructor6 c,String theatre, int seat){
		this(c.movie,c.name);
		this.theatre = theatre;
		this.seat = seat;
	}
	Constructor6(String movie,String name){
		this.movie =movie;
		this.name = name;
	}
	void show () {
		System.out.println("movie name :"+movie);
		System.out.println("person name :"+name);
		System.out.println("theatre :"+theatre);
		System.out.println("seat number :"+seat);
		System.out.println("price :"+price);
		System.out.println("location :"+location);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor6 c = new Constructor6("Spiderman","harsha");
		Constructor6 c1 = new Constructor6(c,"sai ram",69);
		Constructor6 c2 = new Constructor6(c1,690);
		Constructor6 c3 = new Constructor6(c2,"hyderabad");
		c3.show();
	}

}
