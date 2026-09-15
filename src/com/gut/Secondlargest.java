package com.gut;

public class Secondlargest {
//second largest
	public static void main(String[] args) {
		int[] a = { 12, 45, 67, 23, 89, 54 };
		int sec = 0;
		int temp = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				temp = i;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (sec < a[j]) {
				if (j == temp) {
					continue;
				}
				sec = a[j];
			}
		}
		System.out.println(sec);
	}

}
