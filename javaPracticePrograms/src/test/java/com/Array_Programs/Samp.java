package com.Array_Programs;

import org.testng.annotations.Test;

public class Samp {
@Test
public void samp1() {
	String str="Nagender".toLowerCase();
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=0;
		for(int j=0;j<=i;j++) {
			if(ch[i]==ch[j])
				count++;
		}		
		if(count==1) {			
			System.out.print(ch[i]);
		}
	}
}
}
