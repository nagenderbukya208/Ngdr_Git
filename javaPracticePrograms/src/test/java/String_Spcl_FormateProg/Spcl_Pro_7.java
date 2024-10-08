package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_Pro_7 
{
@Test
public void spclPro_7()
{
	String s1="a2b3c1r6";//o/p => aabbbc
	for (int i = 0; i < s1.length(); i+=2) {
		int numericValue = Character.getNumericValue(s1.charAt(i+1));
		for (int j = 0; j < numericValue; j++) {
			System.out.print(s1.charAt(i));			
		}		
	}	
}
}
