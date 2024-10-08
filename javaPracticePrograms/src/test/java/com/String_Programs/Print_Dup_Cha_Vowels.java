package com.String_Programs;

import org.testng.annotations.Test;

public class Print_Dup_Cha_Vowels {
@Test
public void duplicateCharInVowels()
{
	String s1="NagenderIamFromSuryapeta";
	String vowel="aeiouAEIOU";
	for(int i=0;i<s1.length();i++)
	{
		int count=0;
		char ch1=s1.charAt(i);
		for(int j=0;j<s1.length();j++)
		{
			char ch2=s1.charAt(j);
			if(ch1==ch2 && i>j)
			{
				break;
			}else if(ch1==ch2)
				count++;
		}
		if(count>1)
		{
			if(vowel.contains(ch1+""))
				System.out.println(ch1+"==>"+count);
		}
	}
}
}
