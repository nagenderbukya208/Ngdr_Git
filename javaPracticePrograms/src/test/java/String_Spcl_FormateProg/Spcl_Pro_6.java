package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_Pro_6 
{
@Test
public void spclPro_6()
{
	String s1="1#2!";//o/p =>21#!
	String num=s1.replaceAll("[^0-9]", "");
	String spl=s1.replaceAll("[0-9]", "");
	String s2="";
	String revnum=new StringBuffer(num).reverse().toString();
	s2=revnum+spl;
	System.out.println(s2);
}
}
