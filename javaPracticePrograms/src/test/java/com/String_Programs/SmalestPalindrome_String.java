package com.String_Programs;

import org.testng.annotations.Test;

public class SmalestPalindrome_String {
@Test
public void small1()
{
	String s1="is aca madam malayalam a";
	String[] str = s1.split(" ");
	String small=null;
	for(String words:str)
	{
		String word=words;
		String rev = new StringBuffer(word).reverse().toString();
		if(word.equals(rev))
		{
			small=word;
			break;
		}
	}
	
	for(String words:str)
	{
		String word=words;
		String rev = new StringBuffer(word).reverse().toString();
		if(word.equals(rev)&& rev.length()<small.length())
		{
			small=word;
		}
	}
	System.out.println(small);	
}
// Another Way
@Test
public void small2()
{
	String s1="is aca madam malayalam a";
	String[] str = s1.split(" ");
	String small=null;
	for(String word:str)
	{
		String rev = new StringBuffer(word).reverse().toString();
		if(word.equals(rev))
		{
			if(small==null || rev.length()<small.length())
			{
				small=rev;
			}
		}
	}
	System.out.println(small);
 }
}
