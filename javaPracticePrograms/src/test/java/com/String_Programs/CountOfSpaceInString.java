package com.String_Programs;

import org.testng.annotations.Test;

public class CountOfSpaceInString {
@Test
public void countOfSpacePresentInStr() {
	String str="Ind ia Tela ngana Hydera bad";
	int count=0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println(count);
}
}
