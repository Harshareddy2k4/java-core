package com.array;

//Find the position of the smallest element
public class Array21 {

	public static void main(String[] args) {
		int[] a = { 12, 36, 78, 987, 76, 1 };
		int posi = 0;

		for (int i = 0; i < a.length; i++) {
			int temp = a[0];
			if (temp > a[i]) {
				temp = a[i];
			}
			posi = i;
		}
		System.out.println(posi);
	}

}
