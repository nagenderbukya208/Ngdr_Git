package com.Array_Programs;

import org.testng.annotations.Test;

public class SmallestEleArr {
@Test
public void smallestEleInArr() {
	int a[]= {6,75,32,4,65,1,87,54,2};
	int smallEle=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<smallEle) {
			smallEle=a[i];
			
	}
}
	System.out.println(smallEle);
}}
