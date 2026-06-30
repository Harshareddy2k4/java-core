package com.javaintro;
//if and else if
import java.util.Scanner;
public class Condition2 {
	public static void main(String[] args) {
		System.out.println("ENTER THE AGE");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("NUMBER IS NEGATIVE");
		}else if(num>0){
			System.out.println("NUMBER IS POSITIVE");
		}else {
			System.out.println("NUMBER IS 0");
		}
		sc.close();
	}

}
