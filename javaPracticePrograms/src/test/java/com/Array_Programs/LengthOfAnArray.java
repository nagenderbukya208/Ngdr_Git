package com.Array_Programs;

import org.testng.annotations.Test;

public class LengthOfAnArray {
@Test
public void lengthOrSizeOfAnArray() {
	int a[]= {2,4,6,8,7,5,3};
	int count=0;
	for(int i=0;i<a.length;i++) {
		count++;
	}
	System.out.println(count);
}
}
