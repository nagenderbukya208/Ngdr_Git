package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_pro_2 
{
@Test
public void spcl_Pro_2()
{
	String s1="a#d$s%";
	String res=s1.replaceAll("[^a-z]", "");
	for(int i=res.length()-1;i>=0;i--)
	{
		char ch=res.charAt(i);
		System.out.print(ch);
	}
}
@Test
public void spcl_Pro_2_2()
{
	String s1="a#d$s%";
	String[] str=s1.split("[^a-z]");
	for(int i=str.length-1;i>=0;i--)
	{
		if(str[i]!="")
		{
			System.out.print(str[i]);
		}
	}
}
}