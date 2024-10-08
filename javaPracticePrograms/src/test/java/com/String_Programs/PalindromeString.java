package com.String_Programs;

import org.testng.annotations.Test;

public class PalindromeString {
@Test
public void palindromeString() {
	String str="Madam".toLowerCase();
	String str2="";
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		str2=str2+ch;
	}
	if(str2.equals(str)) {
		System.out.println("Palemdrom String");
	}else {
		System.out.println("Not palindrome String");
	}
}
}
