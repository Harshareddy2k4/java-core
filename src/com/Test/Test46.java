package com.Test;

public class Test46 {

	public static void main(String[] args) {
		int a[] = { 35, 41, 29, 72, 87 };
		for (int i = 0; i < a.length; i++) {
			int temp = Math.round(a[i] / 10.0f) * 10;
			System.out.print(temp + " ");

		}

	}

}
