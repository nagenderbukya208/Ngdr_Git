package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RightShift {
@Test
public void rightShift() {
	int a[]= {2,5,6,8};
	int temp=a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
	}
	a[0]=temp;
	System.out.println(Arrays.toString(a));
}
}
