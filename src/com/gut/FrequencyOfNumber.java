package com.gut;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING :");
		String a = sc.nextLine();
		int count[] = new int[26];
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if(ch!=' ') {
				ch = Character.toLowerCase(ch);
			count[ch - 'a']++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + " -> " + count[i]);
			}
		}
		sc.close();
	}

}
