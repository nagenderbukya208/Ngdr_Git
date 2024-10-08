package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArrDescendingOrder {
@Test
public void sortAnArrInDescendingOrder() {
	int a[]= {12,7,15,6,4,166,9,3,11};
	for(int p=1;p<a.length;p++) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				int temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
