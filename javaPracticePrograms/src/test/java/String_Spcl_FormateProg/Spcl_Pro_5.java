package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_Pro_5 
{
@Test
public void spclPro_5()
{
	String s1="#1$2";// o/p =>21
	String res=s1.replaceAll("[^0-9]", "");
	for(int i=res.length()-1;i>=0;i--)
	{
	    int val=Character.getNumericValue(res.charAt(i));
	    System.out.print(val);
	}
}
}
