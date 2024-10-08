package com.String_Programs;

import org.testng.annotations.Test;

public class FindLargestWordString {
@Test
public void findLargestWordInString() {
	String str="India Telangana Hyderabad";
	String[] s = str.split(" ");
	int langestLength=0;
	String longestWord="";
    for (int i = 0; i < s.length; i++)
    {
		if(s[i].length() > longestWord.length())
		{
			longestWord=s[i];
			langestLength=s[i].length();
		}
	}   
    System.out.println(longestWord+" "+langestLength);
		
	}
}

