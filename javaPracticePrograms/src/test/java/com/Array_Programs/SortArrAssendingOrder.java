package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArrAssendingOrder {
@Test
public void sortAnArrInAsseOrder() {
	int a[]= {6,2,9};
	for(int p=0;p<a.length-1;p++) {
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]) {
				int temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
//	for(int i:a)
//		System.out.print(i+" ");
}
@Test
public void sortAnArrInAsseOrder2() {
	int a[]= {6,2,9,4,7,1,3,8};
	for(int p=1;p<a.length;p++) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i+1];
			 a[i+1]=a[i];
			 a[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
 }
}
