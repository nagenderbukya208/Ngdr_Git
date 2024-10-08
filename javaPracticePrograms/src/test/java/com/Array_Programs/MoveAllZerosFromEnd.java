package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveAllZerosFromEnd {
@Test
public void moveAllZerosFromTheEnd() {
	int a[]= {3,7,32,0,2,6,0,75,12,8},count=0;	
	for(int i=0;i<a.length;i++){
		if(!(a[i]==0)) {
			a[count++]=a[i];
		}
	}
	while(count<a.length)
	{
		a[count++]=0;
	}
	System.out.println(Arrays.toString(a));
}

@Test
public void moveAllZerosFromTheEnd1() 
{
int a[]= {4,0,7,9,0,5};
int j=0;
for(int i=0;i<a.length;i++) 
{
	if(a[i]!=0)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		j++;
	 }
  }
System.out.println(Arrays.toString(a));
 }
}
