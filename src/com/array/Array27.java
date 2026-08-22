package com.array;

public class Array27 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 78, 13, 78, 1, 69 };
		int count = 0;
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
				count++;
			}
		}
		System.out.println("TOTAL COUNT OF UNIQUE VALUES :" + count);

	}

}
