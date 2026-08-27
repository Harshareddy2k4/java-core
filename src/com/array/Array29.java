package com.array;

//Find the smallest leader element
public class Array29 {

	public static void main(String[] args) {
		int[] a = { 16, 17, 4, 3, 5, 2 };
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] <= a[j]) {
					flag = false;
					break;
				}
			}
			if (flag && temp > a[i]) {
				temp = a[i];
			}
		}
		System.out.println("SMALLEST LEADER ELEMENT :" + temp);
	}

}
