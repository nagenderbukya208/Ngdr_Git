package String_Spcl_FormateProg;

import org.testng.annotations.Test;

public class Spcl_Pro_8 
{
@Test
public void spclPro_8()
{
	String s1="aabbbbc";//o/p =>a2b4c1
	for (int i = 0; i < s1.length(); i++) {
		int count=0;
		for (int j = 0; j < s1.length(); j++) {
			if(s1.charAt(i)==s1.charAt(j) && i>j) {
				break;
			}
			else if (s1.charAt(i)==s1.charAt(j)) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.print(""+s1.charAt(i)+count);
		}
		
	}
}
}
