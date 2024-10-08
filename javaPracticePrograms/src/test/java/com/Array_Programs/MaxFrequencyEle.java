package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MaxFrequencyEle {
@Test
public void maxFrequencyEle() {
	int a[]= {2,5,7,2,5,2};
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==b[j]) 
				count++;
		}
		if(count==1)
		b[i]=a[i];
		
	}
}
}
