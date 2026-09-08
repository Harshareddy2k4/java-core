package com.Test;
class Orderdetails{
	int order_id;
	 String customer_name ;
	 double price;
	 void display() {
		 System.out.println("Order id :"+this.order_id);
		 System.out.println("Customer name :"+this.customer_name);
		 System.out.println("Price :"+this.price);
	 }
}
class Pizzaorder extends Orderdetails{
	
}
class Burgerorder extends Orderdetails{
	
}
public class Test58 {

	public static void main(String[] args) {
		Pizzaorder p = new Pizzaorder();
		p.order_id =101;
		p.customer_name="babu";
		p.price = 1000;
		p.display();
		Burgerorder b = new Burgerorder();
		b.customer_name = "Karthik";
		b.order_id = 102;
		b.price = 999;
		b.display();
		

	}

}
