package com.Array_Programs;

import org.testng.annotations.Test;

public class SeconsmallestEle {
	@Test
	public void secondSmallestEle() {
	int a[]= {12,32,65,54,98,4,64,3,2};
	int max1=a[0];
	int max2=max1;
	
		for (int i = 0; i < a.length; i++) {
		if(a[i]<max1)
		{			
			 max2 = max1;
             max1 = a[i];			
		}
		else if(a[i]<max2 && a[i]!=max1)
		{
			max2=a[i];
		}		
	}	
    System.out.println(max2);
	}
}
	
