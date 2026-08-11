package com.Test;

public class Test8 {
	int id;
	String name;
	double price;
	Test8(int id,String name,double price ){
		this.id = id;
		this.name = name;
		this.price = price ;
	}
	
	public static void main(String[] args) {
		System.out.println("----product details----");
		Test8 t = new Test8(1,"mama_earth",300);
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.price);
	}

}
