package com.Array_Programs;

import org.testng.annotations.Test;

public class PrintElementsInArray {
@Test
public void printTheElementsInArray() {
	int a[]= {1,3,5,7,9,8,6,4,2};
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
