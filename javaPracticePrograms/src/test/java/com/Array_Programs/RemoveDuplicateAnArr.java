package com.Array_Programs;

import org.testng.annotations.Test;

public class RemoveDuplicateAnArr {
@Test
public void removeDuplicateAnArray() {
	//Print the Duplicate elements(1)
	int a[]= {2,8,6,2,8,9,4,7,2,3};
	for(int i=1;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[i]==a[j]&&i>j)
				System.out.println(a[j]);
		}
	}
}
@Test
public void removeDuplicateAnArray2() {
	//Print the Duplicate elements (2)  
	int a[]= {1,1,2,2,3,1,4,5,2,2,3,3};
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<=i;j++) {		
			if(a[i]==a[j])
				count++;
	}
		if (count==2)
			System.out.println(a[i]);
   }
}
@Test
public void removeDuplicateAnArray3() {
	//Remove the duplicates
	int a[]= {10,15,12,22,10,25,15,33,10,24};
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<=i;j++) {
			if(a[i]==a[j])
				count++;
		}
		if(count==1)
			System.out.print(a[i]+" ");
		
	}
}
}
