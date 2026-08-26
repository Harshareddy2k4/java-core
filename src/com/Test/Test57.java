package com.Test;
//leader number with single for loop
public class Test57 {

	public static void main(String[] args) {
		int[] a = { 16, 17, 4, 3, 5, 2 };
		int temp = a[a.length - 1];
		System.out.println(temp);
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > temp) {
				temp = a[i];
				System.out.println(temp);
			}
		}
	}

}
