package com.String_Programs;

import org.testng.annotations.Test;

public class ReverseString {
@Test
public void reverseTheString() {
	String str="Nagender";
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		System.out.print(ch);
	}
}
//================================================================================
@Test
public void reverseTheString2() {
	String str="Nagender";
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i)+" ");
	}
}
//============================================================================
@Test
public void reverseTheString3() {
	String str="Nagender";
	char[] c = str.toCharArray();
	for(int i=c.length-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
}
//===============================================================================
@Test
public void reverseTheString4() {
	String str="Telangana";
	String str1=str;
	StringBuilder res=new StringBuilder();
	StringBuilder reverse = res.append(str).reverse();
	System.out.println(reverse);
}
//================================================================================
@Test
public void reverseTheString5() {
	String str="India";
	StringBuffer res= new StringBuffer();
	StringBuffer reverse = res.append(str).reverse();
	System.out.println(reverse);
}
}

