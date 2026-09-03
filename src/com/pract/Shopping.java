package com.pract;

public class Shopping {
	private int item;
	private double totala;
	public int getCartitem() {
		return item;
	}
	public void setCartitem(int item) {
		this.item = item;
	}
	public double getTotala() {
		return totala;
	}
	public void setTotala(double totala) {
		this.totala = totala;
	}
	public void addItem(double additem) {
		System.out.println("TOTAL ITEMS ADDED :"+item);
		System.out.println("PRICE of "+item+ " IS :"+additem);
		totala+=additem;
		item++;
	}
	public void remItem(double remitem) {
		totala-=remitem;
		item--;
		System.out.println("PRICE OF "+item+ " IS :"+remitem);
		System.out.println("REMOVED ITEM :"+item);
	}
	public void gettotal() {
		System.out.println("TOTAL AMOUNT :"+totala);
	}
}
