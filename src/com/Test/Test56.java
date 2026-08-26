package com.Test;

//leader numbers 
public class Test56 {

	public static void main(String[] args) {
		int[] a = { 16, 17, 4, 3, 5, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(a[i]);
			}
		}

	}

}
