package com.Array_Programs;

import org.testng.annotations.Test;

public class EleIsPresentRNot {
	@Test
	public void givenEleIsPresentRNot() {
		int a[] = { 2, 4, 6, 8, 3, 5, 7, 9 };
		int Ele = 12;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == Ele)
				System.out.println("the given Ele is present :" + a[i]);
		}
		System.out.println("the given Ele is Not present :"+Ele);
	}
}
