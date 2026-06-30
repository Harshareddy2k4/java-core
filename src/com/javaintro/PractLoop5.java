package com.javaintro;
//multiple tables using for loop
public class PractLoop5 {

	public static void main(String[] args) {
		for(int n = 1;n<=20;n++) {
			System.out.println("table of :"+n);
			for(int i = 1;i<=10;i++) {
				System.out.println(n+"x"+i+"="+(n*i));
			}
		}

	}

}
