package com.String_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AnagramString_r_Not 
{
@Test
public void anagramString() {
	String s1="night";
	String s2="thing";
	if(s1.length()==s2.length())
	{
	char[] ch1 = s1.toCharArray();
	char[] ch2= s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1,ch2))
	{
		System.out.println(s1+","+s2+"=>Is Anagram");
	}else
		System.out.println(s1+","+s2+"=>Is Not Anagram");
	}else
		System.out.println(s1+","+s2+"=>Is Not Anagram");
}
}
