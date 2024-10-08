package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LeftShiftNoOfTimes {
@Test
public void leftShiftNoOfTimesByUser() {
	int a[]= {5,2,6,8,1,3};
	int n=3;	
	for(int i=1;i<=n;i++) { 
		int temp=a[0];
	for(int j=0;j<a.length-1;j++) {
		a[j]=a[j+1];
	}
	a[a.length-1]=temp;
	}	
	System.out.print(Arrays.toString(a));
}
//wjp lift shift after first shift should not change the last element
@Test
public void leftShiftNoOfTimesByUser2() {
	int a[]= {5,2,6,8,1,3};
	int n=3,l=a.length-1;
	for(int i=1;i<=n;i++) { 
		int temp=a[0];
	for(int j=0;j<l;j++) {
		a[j]=a[j+1];
	}
	a[l]=temp;
	l--;
	}	
	System.out.print(Arrays.toString(a));
}
}
