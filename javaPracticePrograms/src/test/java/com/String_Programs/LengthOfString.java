package com.String_Programs;

import org.testng.annotations.Test;

public class LengthOfString {
@Test
public void lengOrCountOfString() {
	String s1="Nagender";
	int count=0;
	for(int i=0;i<s1.length();i++) {
		count++;
	}
	System.out.println("No length of the string is : "+count);
}
//===================================================================
@Test
public void lengOrCountOfString2() {
	String s1="Charan";
	System.out.println("No.of counts in string is : "+s1.length());
}
}
