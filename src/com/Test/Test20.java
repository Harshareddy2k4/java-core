package com.Test;

public class Test20 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a = 69;
		String result =(a<45)?"fail":
			(a>=45&&a<60)?"D":
					(a>=60&&a<75)?"C":
						(a>=75&&a<90)?"B":"A";
		System.out.println(result);
	}

}
