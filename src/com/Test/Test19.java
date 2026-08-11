package com.Test;

public class Test19 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a= 69;
		String result =(a>=90)? "A":
		(a>=75)?"B":
			(a>=60)?"C":
				(a>=40)?"D":"FAIL";
		System.out.println(result);

	}

}
