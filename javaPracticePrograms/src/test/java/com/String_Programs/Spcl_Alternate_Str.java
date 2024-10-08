package com.String_Programs;

import org.testng.annotations.Test;

public class Spcl_Alternate_Str {
	@Test
	public void sample1()
	{
		String s1 = "life is beautiful jurny";
		String[] str = s1.split(" ");
		int k=0;
		for (int i = 1; i < str.length; i += 2) {
			String temp = str[i];
			String rev = "";
			for (int j = 0; j < temp.length(); j++) {
				rev = temp.charAt(j) + rev;

			}
			System.out.print(str[k]+" "+rev+" ");
			k+=2;
		}
	}
	@Test
	public void sample2()
	{
		String s1="life is beautiful journy";
		String[] str = s1.split(" ");
		String s2="";
		for(int i=0;i<str.length;i++)
		{
			if(i%2==1)
			{
				for(int j=str[i].length()-1;j>=0;j--)
				{
					s2=s2+str[i].charAt(j);
				}
				s2=s2+" ";
			}else
				s2=s2+str[i]+" ";
		}
		System.out.println(s2);
	}
}
