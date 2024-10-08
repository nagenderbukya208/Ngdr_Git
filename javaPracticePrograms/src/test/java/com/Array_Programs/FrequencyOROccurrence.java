package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FrequencyOROccurrence {
@Test
public void frequencyOrOccurrence(){
   int a[]= {12,24,16,25,12};
   int b[]=new int[a.length];
   for(int i=0;i<a.length;i++) {
	   int count=0;
	   for(int j=0;j<=i;j++) {
		   if(a[i]==a[j])
			   count++;
	   }
	   if(count==1)
		   b[i]=a[i];
   }
   for(int i:b) {
	   if(i!=0) {
		   int count=0;
		   for(int j:a) {
			   if(i==j)
				   count++;
		   }
		   System.out.println(i+"==>"+count);
	   }
   }
}
//==========================================================================
@Test
public void FrequencyOROccurrence2() {
	int a[]= {10,5,10};
	for (int i = 0; i <a.length; i++) {
		int count = 0;
		for (int j =0; j <a.length; j++) {
			if (a[i] == a[j]) {
				if (i > j) {
					break;
				} else {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println(a[i]+" ===>"+ count);
		}
	}
}
}

