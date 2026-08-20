package com.Test;

public class Test45 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum =0;
		int avg =0;
		int count =0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			count++;
		}
		avg=sum/count;
		System.out.println("TOTAL SUM IS :"+sum);
		System.out.println("TOTAL AVG IS :"+avg);
	}

}
