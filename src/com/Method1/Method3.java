package com.Method1;

import java.util.Scanner;

public class Method3 {
	Scanner sc = new Scanner(System.in);
	double getPrice(){
		double price =0;
		System.out.println("enter price :");
		 price =sc.nextDouble();
		return price;
	}
	
	int getQuantity() {
		System.out.println("enter quantity :");
		return sc.nextInt();
	}
	 void main(String[] args) {
		System.out.println("welcome to main method");
		
		double p = getPrice();
		int q = getQuantity();
		System.out.println("total amount is :"+p*q);
	}

}
