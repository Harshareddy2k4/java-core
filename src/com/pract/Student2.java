package com.pract;

public class Student2 {

	private int cartItems;
	private double totalAmount;

	public int getCartItems() {
		return cartItems;
	}

	public void setCartItems(int cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void addItem(double price) {
		cartItems++;
		totalAmount += price;

		System.out.println("Item Added");
		System.out.println("Item Price: " + price);
	}

	public void removeItem(double price) {

		if (cartItems > 0 && totalAmount >= price) {
			cartItems--;
			totalAmount -= price;

			System.out.println("Item Removed");
			System.out.println("Removed Item Price: " + price);
		} else {
			System.out.println("No items to remove");
		}
	}

	public void getTotal() {
		System.out.println("Total Items: " + cartItems);
		System.out.println("Total Amount: " + totalAmount);
	}
}
