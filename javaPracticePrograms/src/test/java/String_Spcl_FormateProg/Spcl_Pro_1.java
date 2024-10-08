package String_Spcl_FormateProg;

public class Spcl_Pro_1
{
public static void main(String[] args) {
	String s="$0#1@2";//o/p =>3
	String rep=s.replaceAll("[^0-9]", "");
	int sum=0;
	for(int i=0;i<rep.length();i++)
	{
		sum=sum+Character.getNumericValue(rep.charAt(i));
	}
	System.out.println(sum);
}
}
