package com.Array_Programs;

import java.sql.Array;
import java.util.Arrays;

import org.testng.annotations.Test;

public class CopyArrayInRevOrder {
@Test
public void copyOneArrEleToAnotherArrRevOrd() {
	int a[]= {1,2,3};
	int b[]= new int[a.length];
	for(int i=a.length-1;i>=0;i--) {
		b[a.length-1-i]=a[i];	
	}
	System.out.println(Arrays.toString(b));
}
@Test
public void copyOneArrEleToAnotherArrRevOrd2() {
	int a[]= {1,2,3};
	int b[]=new int [a.length];
	for(int i=a.length-1;i>=0;i--) {
		b[i]=a[i];
		System.out.print(b[i]+" ");
	}
	//System.out.println(Arrays.toString(b));
}
}
