package com.Test;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("movie ticket details:");
		int tic_id = 1;
		byte screen_num = 2;
		int ticket_price =300;
		boolean status = true;
		short age = 23;
		byte num_tick = 5;
		long number = 9392667871L;
		float gst = ticket_price*1.5f;
		float total = num_tick*gst;
		
		System.out.println("ticket id :"+tic_id);
		System.out.println("screen number :"+screen_num);
		System.out.println("ticket price :"+ticket_price);
		System.out.println("ticket comformed :"+status);
		System.out.println("viewer age :"+age);
		System.out.println("number of tickets :"+num_tick);
		System.out.println("mobile number :"+number);
		System.out.println("total price of each ticket with gst :"+gst);
		System.out.println("total amount :"+total);

	}

}
