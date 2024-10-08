package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_Pro_4 
{
@Test
public void spclPro_4()
{
	String s1="6$4!A9%2N";
	String leters=s1.replaceAll("[^A-Za-z]", "");
	String dig=s1.replaceAll("[^0-9]", "");
	int sum=0;
	String revlet=new StringBuilder(leters).reverse().toString();
	for(int i=0;i<dig.length();i++)
	{
	  sum+=Character.getNumericValue(dig.charAt(i));		
	}
	String res= revlet+sum;
	System.out.println(res);
}
}
