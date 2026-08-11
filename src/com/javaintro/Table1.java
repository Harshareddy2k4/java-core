package com.javaintro;

import java.util.Scanner;

//for loop
public class Table1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
	}
		sc.close();
}
}