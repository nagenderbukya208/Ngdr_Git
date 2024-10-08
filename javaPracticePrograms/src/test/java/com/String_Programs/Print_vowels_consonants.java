package com.String_Programs;

import org.testng.annotations.Test;

public class Print_vowels_consonants {
@Test
public void Vowels_Consonants() {
	String s1="Hyderabad is the capital of telangana";
	String v="";
	String con="";
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
	if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){	
		v= v+c;
	}else {
		con=con+c;
		
	}
	}
	System.out.println("vowels of the string ==> "+v);
	System.out.println("consonants of the given string ==> "+con);
}
@Test
public void Vowels_Consonants2() {
	String s1="Hyderabad is the capital of telangana";
	String s2="AEIOUaeiou";
	String vowels="";
	String cons="";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(s2.contains(ch+""))
		{
			vowels=vowels+ch;
		}
		else
			cons=cons+ch;
	}
	System.out.println("vowels are ==>"+vowels+" ");
	System.out.println("cons are ==>"+cons+" ");
}
@Test
public void Patran() {
	int n=5;
	for(int i=0;i<n;i++) {
		for(int j=n;j>=0;j--) {	
		System.out.print("* ");
	}
		System.out.println();
    }
  }
@Test
public void sample()
{
	String s1="BukyaNagende123456r";
    // String str=s1.replaceAll("[^A-Za-z]","");
     String s2="AEIOUaeiou";
     String vowels="";
     String conso="";
     for(int i=0;i<s1.length();i++)
     {
         char ch=s1.charAt(i);
        if(Character.isAlphabetic(ch))
        {
         if(s2.contains(ch+""))
         {
             vowels=vowels+ch;
         }else
         conso=conso+ch;
     }
     }
     System.out.println(vowels);
     System.out.println(conso);
}
}