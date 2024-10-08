package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LeftShiftAnArr {
@Test
public void lefyShiftAnArray() {
	int a[]= {2,4,6,8};
	int temp=a[0];
	for(int i=0;i<a.length-1;i++) 
		a[i]=a[i+1];
	
	a[a.length-1]=temp;
//	for(int i:a) {
//		System.out.print(i+" ");
//	}
	System.out.println(Arrays.toString(a));
}
}
