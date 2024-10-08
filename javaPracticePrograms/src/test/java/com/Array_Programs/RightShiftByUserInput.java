package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RightShiftByUserInput {
@Test
public void rightShiftByUserInput() {
	int a[]= {2,4,6,8,5,7,9};
	int n=2;
	for(int i=1;i<=n;i++) {
		int temp=a[a.length-1];
	for(int j=a.length-1;j>0;j--) {
		a[j]=a[j-1];
	}
	a[0]=temp;
  }
	System.out.println(Arrays.toString(a));
 }
}
