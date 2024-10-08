package com.String_Programs;

import org.testng.annotations.Test;

public class Replace_Char_Another_Char 
{
	@Test
	public void replace1()
	{
	 String s1="Apple";
     String c="p";
     String rep="n";
     String s2="";
     for(int i=0;i<s1.length();i++)
     {
         char ch=s1.charAt(i);
         if(c.contains(ch+""))
         {
             s2=s2+rep;
         }else
         s2=s2+ch;
     }
     System.out.println(s2);
	}
//**************************************************************
	@Test
	public void replace2()
	{
      String s1="Apple";
	  char old='p';
	  char rep='n';
	  char[] ch=s1.toCharArray();
	  for(int i=0;i<ch.length;i++)
	  {
		if(ch[i]==old)
		{
			ch[i]=rep;
		}
	  }
	  String newstring=new String(ch);
	  System.out.println(newstring);
	}
//***************************************************************
	@Test
	public void replace3()
	{
		String s1="Apple";
		  char old='p';
		  char rep='n';
	  StringBuffer sb=new StringBuffer(s1);
	  for(int i=0;i<sb.length();i++)
	  {
		  if(sb.charAt(i)==old) 
		  {
			  sb.setCharAt(i, rep);
		  }
	  }
	  System.out.println("old String ==>"+s1);
	  System.out.println("new String ==>"+sb.toString());
	}
//**************************************************************
// Using replace()
	@Test
	public void replace4()
	{
		String s1="Apple";
		  char old='p';
		  char rep='n';	
     char[] ch=s1.toCharArray();
     for(int i=0;i<ch.length;i++)
     {
    	if(ch[i]==old)
    	{
    	 s1=s1.replace(old, rep);
    	}
     }
     System.out.println(s1);
}
}
