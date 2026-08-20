package com.Test;

public class Test47 {

	public static void main(String[] args) {
		int a[] = { 35, 41, 29, 72, 87 };
		for(int i =0;i<a.length;i++) {
			if(a[i]%10<6) {
				a[i]=a[i]-(a[i]%10);
			}else {
				a[i]=a[i]+(10-(a[i]%10));
			}
			System.out.print(a[i]+" ");
		}

	}

}
