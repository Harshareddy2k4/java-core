package com.javaintro;
//num of number between 1 to 100 which are divisible by 3
public class PractLoop8 {

	public static void main(String[] args) {
		int count =0;
		for(int i=1;i<=100;i=i++) {
			if(i%3==0) {
			count++;
			}
		}
		System.out.println(count);
	}

}
