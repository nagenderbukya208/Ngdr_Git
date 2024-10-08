package com.Array_Programs;

import org.testng.annotations.Test;

public class MaxFrequency {
@Test
public void maxFrequency() {
	int a[]= {10,20,10,12,20,32,20};
	int Ele=0;
	int Freq=0;
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]&& i>j) {
				break;
			}else if(a[i]==a[j]) {
				count++;
			}
		}
		if(count>Freq) {
			Ele=a[i];
			Freq=count;			
		}
	}
	System.out.println(Ele+"==>"+Freq);
}

}
