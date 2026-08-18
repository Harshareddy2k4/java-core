package com.array;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		int[] a = { 12, 34, 22, 0, -12, -13, 0, 12 };
		int poscount = 0;
		int negcount = 0;
		int zercount = 0;
		int[] rei = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			rei[i] = a[i];
			if (a[i] > 0) {
				poscount++;
			} else if (a[i] < 0) {
				negcount++;
			} else {
				zercount++;
			}
		}
		int[] pos = new int[poscount];
		int[] neg = new int[negcount];
		int[] zer = new int[zercount];
		int poscounter = 0;
		int negcounter = 0;
		int zerocounter = 0;
		for (int i = 0; i < rei.length; i++) {
			if (rei[i] > 0) {
				pos[poscounter] = rei[i];
				poscounter++;
			} else if (rei[i] < 0) {
				neg[negcounter] = rei[i];
				negcounter++;
			} else {
				zer[zerocounter] = rei[i];
				zerocounter++;
			}
		}
		System.out.println("POSITIVES :" + Arrays.toString(pos)+" AND COUNT IS :"+poscount);
		System.out.println("NEGATIVES :" + Arrays.toString(neg)+" AND COUNT IS :"+negcount);
		System.out.println("ZEROS :" + Arrays.toString(zer)+" AND COUNT IS :"+zercount);

	}

}
