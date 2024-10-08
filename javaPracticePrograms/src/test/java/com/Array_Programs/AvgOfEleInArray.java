package com.Array_Programs;

import org.testng.annotations.Test;

public class AvgOfEleInArray {
@Test
public void aveOfElementsInArray() {
	int a[]= {2,4,6,8};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	double avg=sum/a.length;
	System.out.println(avg);
}
}
