package com.Array_Programs;

public class PrintDupEle_Occurence {
	public static void main(String[] args) {
		int a[] = { 8,5, 2, 8,5, 8,5, 1, 6, 2, 9,2,2 };
		int maxcount = 0;
		int maxint=0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j] && i > j) {
					break;
				} else if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				maxint=a[i];
			}

		}
		System.out.println(maxint+":"+maxcount);
	}
}
