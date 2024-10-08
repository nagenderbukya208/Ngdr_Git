package com.Array_Programs;

import org.testng.annotations.Test;

public class LargestEleInArr {
@Test
public void largestEleInArray() {
	int a[]= {2,7,155,12,63,24,250,55};
	int maxEle=a[0];
	for(int i=1;i<a.length-1;i++) {
		if(a[i]>maxEle)
			maxEle=a[i];
	}
	System.out.println(maxEle);
}
}
