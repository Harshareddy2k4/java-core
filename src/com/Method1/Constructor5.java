package com.Method1;

public class Constructor5 {
	String name;
	String item;
	String quantity;
	int table;
	double bill;
Constructor5(Constructor5 c1,double bill){
		this(c1.name,c1.item);
		this.quantity=c1.quantity;
		this.table = c1.table;
		this.bill = bill;
	}
Constructor5(Constructor5 c,String quantity,int table){
	this(c.name,c.item);
	this.quantity = quantity;
	this.table =table;
}
Constructor5(String name,String item){
	this.name = name;
	this.item = item;
}
	void show() {
		System.out.println("---welcome to restaurant---");
		System.out.println("Restaurant name :"+name);
		System.out.println("ordered item :"+item);
		System.out.println("order quantity :"+quantity);
		System.out.println("table number :"+table);
		System.out.println("Total bill :"+bill);
		System.out.println("----Thanks for Visiting----");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor5 c = new Constructor5("paradise","chickenn biryani");
		Constructor5 c1 = new Constructor5(c,"2 family packs",69);
		Constructor5 c2 = new Constructor5(c1,1500);
		c2.show();
		
	}

}
