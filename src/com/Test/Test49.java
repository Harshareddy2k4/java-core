package com.Test;

public class Test49 {

	public static void main(String[] args) {
		int[] a = { 13, 1, 78, 87, 76, 1 };
		int evenc = 0;
		int oddc = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenc++;
			} else {
				oddc++;
			}
		}
		System.out.println("TOTAL EVEN COUNT :" + evenc);
		System.out.println("TOTAL ODD COUNT :" + oddc);
	}

}
