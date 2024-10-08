package com.String_Programs;

import org.testng.annotations.Test;

public class RemoveDuplicatesFromString {
@Test
public void removeDuplicateFromString() {
	String str="Nagender".toLowerCase();
	String str2="";
	for(int i=0;i<str.length();i++) {
		String str3 = str.charAt(i)+"";
		if(!(str2.contains(str3))) {		
          str2=str2+str3;
	}	
}
	System.out.println(str2);
}
//==================================================================
@Test
public void removeDuplicateFromString2() {
	String str="Nagender".toLowerCase();
	String str2="";
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(!(str2.contains(ch+""))) {
		str2=str2+ch;	
		}
	}
	System.out.println(str2);
}
//====================================================================
@Test
public void removeDuplicateFromString3() {
	String str="BukyaNagender".toLowerCase();
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
