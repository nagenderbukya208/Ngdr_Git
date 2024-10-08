package com.String_Programs;

import org.testng.annotations.Test;

public class FrequencyOfWord {
@Test
public void frequencyOfEachWord() {
	String str="Hello Hi Hello Bye Hello";
	   String[]	s1=str.split(" ");
	   for(int i=0;i<s1.length;i++) {
		   int count=0;
		   for(int j=0;j<s1.length;j++) {
			   if(s1[i].equals(s1[j])&& i>j) {
				  break;
			   }
			   else  if(s1[i].equals(s1[j])) {
				   count++;			   
			   }
		   }
		   if(count>0)
		   System.out.println(s1[i]+"=>"+count);
	   }
	
}
}
