package com.logicalstmts;

import java.util.Scanner;

//Check whether a username is "admin".
public class Statement32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username :");
		String a = sc.next();
		if (a.equalsIgnoreCase("admin")) {
			System.out.println("the given username is admin");
		} else {
			System.out.println("the give username is not admin");
		}
		sc.close();
	}

}
