package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_Pro_3
{
@Test
public void spclPro_3()
{
	String s1="#3@2$1";
	String res=s1.replaceAll("[^0-9]", "");
	char[] ch=res.toCharArray();
	StringBuilder sb=new StringBuilder();
	for(char c:ch)
	{
		int dig=Character.getNumericValue(c);
		int seq=dig*dig;
		sb.append(seq);
	}
	System.out.println(sb.toString());
}
}
