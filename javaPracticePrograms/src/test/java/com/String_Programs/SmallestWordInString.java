package com.String_Programs;

import org.testng.annotations.Test;

public class SmallestWordInString {
@Test
public void smallestWordInString() {
	String str="India Telangana Hyderabad";
	String[] res=str.split(" ");
	String smalestWord=str;
	int smalestLength=0;
	for(int i=0;i<res.length;i++) {
		if(res[i].length() < smalestWord.length()) {
			smalestWord=res[i];
			smalestLength=res[i].length();		
			}
	}
	System.out.println(smalestWord+" "+smalestLength);
}
}
