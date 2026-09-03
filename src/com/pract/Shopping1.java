package com.pract;

public class Shopping1 {

	public static void main(String[] args) {
		Shopping s = new Shopping();
		s.setCartitem(1);
		s.setTotala(100);
		System.out.println("CART ITEM :"+s.getCartitem());
		System.out.println("ITEM PRICE :"+s.getTotala());
		s.addItem(1000);
		s.remItem(200);
		s.getCartitem();
		s.gettotal();
	}

}
