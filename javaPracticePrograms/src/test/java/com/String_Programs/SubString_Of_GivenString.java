package com.String_Programs;

import org.testng.annotations.Test;

public class SubString_Of_GivenString 
{
@Test
public void subStringOfGivestring()
{
	String s1="Hyderabad";
	int length=s1.length();
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<=length;j++)
		{
			String subString=s1.substring(i,j);
			System.out.println(subString);
		}
	}
}
//Or 
@Test
public void subStringOfGivestring2()
{
	String s1="Hyderabad";
	String s2=s1.substring(0,5);
	System.out.println(s2);
}
}
