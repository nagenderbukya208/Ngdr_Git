package com.Array_Programs;

import java.util.Arrays;

public class sample {

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 5, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
