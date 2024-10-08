package com.Array_Programs;

import org.testng.annotations.Test;

public class SecondLargestEleInArr {
public static int secondMax(int a[]) {
	int max1=0, max2=0;
	if(a[0]>a[1]) {
		max1=a[0];
		max2=a[1];
	}
	for(int i=2;i<a.length;i++) {
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
		}else
			if(a[i]>max2) {
				max2=a[i];
			}
	}
	return max2;
}
@Test
public void secondMaxEle() {
	int a[]= {12,32,65};
	int max1=a[0];
	int max2=max1;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max1)
		{			
			 max2 = max1;
             max1 = a[i];			
		}
		else if(a[i]>max2 && a[i]!=max1)
		{
			max2=a[i];
		}		
	}	
    System.out.println(max2);
}
}

