package com.String_Programs;

import org.testng.annotations.Test;

public class Reverse_String_without_rev_word {
@Test
public void reverse_String()
{
	 String s1 = "I love programming in Java";
     
     String[] words = s1.split(" ");
     String reversedString = "";
     for (int i = words.length-1; i >= 0; i--) {
         reversedString += words[i] + " ";
     }
     System.out.println("Original String ===> " + s1);
     System.out.println("Reversed Words String ===>" + reversedString.trim());
}
@Test
public void reverse_String2()
{
	String s1 = "I love programming in Java";
	String s2="";
	String[] str=s1.split(" ");
	for(int i=str.length-1;i>=0;i--)
	{
		s2=s2+str[i]+" ";
	}
	System.out.println("Original ==>"+s1);
	System.out.print("After reversing ==>"+s2);
}
}
