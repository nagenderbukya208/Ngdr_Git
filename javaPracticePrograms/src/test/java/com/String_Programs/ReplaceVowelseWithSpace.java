package com.String_Programs;

import org.testng.annotations.Test;

public class ReplaceVowelseWithSpace {
@Test
public void replaceVowelseWithSpace() {
	String str = "Nagender";
	StringBuilder result = new StringBuilder();
	 char[] str2 = str.toCharArray();
	for (char c : str2) {
           if ("aeiouAEIOU".indexOf(c) != -1) {
               result.append(' ');
           } else {
               result.append(c);
           }
       }	 
	 System.out.println(result);
	 
}
//=========================================================================
@Test
public void replaceVowelseWithSpace2() {
	String str="Nagender";
	//String res="";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
	if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){	
	  str=  str.replace(c, ' ');
}
}	
	System.out.println(str);
}
//=====================================================================================
@Test
public void replaceVowelseWithSpace3() {
	String str="Hello World";
	String v="AEIOUaeiou";
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(v.contains(ch+"")) {
			str=str.replace(ch, ' ');
		}
	}
	System.out.println(str);
}
}