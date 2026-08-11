package com.langfund;
//min and max values with array
public class PractArray3 {

	public static void main(String[] args) {
		int [] num = {79,20,30,40,50,60,70,10,80,90};
		int min =num[0];
		int max = num[0];
		for(int i =1; i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}else {
				if(num[i]>max) {
					max = num[i];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
