package com.array;

//Find unique elements
public class Array26 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 78, 13, 78, 1, 69 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			flag = true;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
