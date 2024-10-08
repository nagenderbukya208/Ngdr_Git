	package com.Array_Programs;

import org.testng.annotations.Test;

public class MergeTwoArrEle {
@Test
public void mergeTwoArrayEle() {
	int a[]= {5,7,9};
	int b[]= {2,4,6};
	int c[]=new int[a.length+b.length];
    for(int i=0;i<c.length;i++) {
    	if(i<a.length)
    		c[i]=a[i];
    	else
    		c[i]=b[i-a.length];
    	System.out.print(c[i]+" ");
    }
}
}
