package com.String_Programs;

import org.testng.annotations.Test;

public class Lexicographically_String 
{
@Test
public void lexicographicallyString()
{
	String s1="Nagender";
	String s2="Charan";

	 int res = s1.compareTo(s2);
	 if(res<0)
	 {
		 System.out.println(s1+" : is smaller then : "+s2);
	 }else if(res>0)
	 {
		 System.out.println(s1+" : is bigger then : "+s2); 
	 }else
		 System.out.println(s1+" : is equals to : "+s2); 
}
}
