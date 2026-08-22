package com.array;

//Find duplicate elements
public class Array25 {

	public static void main(String[] args) {
		int[] a = { 13, 1, 78, -987, 78, 1 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = true;
					System.out.println(a[i]);
					break;
				}
			}
		}
		if (!flag) {
			System.out.println("THERE IS NO DUPLICATE VALUES ");
		}
	}

}
