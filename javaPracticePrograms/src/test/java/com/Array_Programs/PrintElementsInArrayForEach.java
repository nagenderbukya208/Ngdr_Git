package com.Array_Programs;

import org.testng.annotations.Test;

public class PrintElementsInArrayForEach {
@Test
public void printTheElementsInArray() {
	int a[]= {8,3,1,7,9,0,6,2,2};
	for (int i : a) {
		System.out.print(i+" ");
	}
}
}
