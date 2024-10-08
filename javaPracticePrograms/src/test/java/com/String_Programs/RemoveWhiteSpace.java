package com.String_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveWhiteSpace {
	@Test
	public void removeWhiteSpaceFromString() {
		String str = "Hyderabad India  Telangana";
		String[] res = str.split(" ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}

	}
//****************************************************************
	@Test
	public void removeWhiteSpaceFromString2() {
		String str = "Hyderabad India Telangana";
		String replace = str.replace(" ", "");
		System.out.println(replace);
	}
//***************************************************************
	@Test
	public void removeWhiteSpaceFromString3()
	{
		String s1="Ts Srpt Ppd Gkt Ngdr";
		String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
		 char ch=s1.charAt(i);
		 if(s2.contains(ch+""))
		 {
			 s1=s1.replaceAll(ch+"", "");
		 }
		}
		System.out.println(s1);
	}
}
