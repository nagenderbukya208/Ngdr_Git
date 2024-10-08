package com.String_Programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Given_Word_Present_r_Not
{
@Test
public void giveWordIsPresentOrNot()
{
	String s1="My name is nagender curently i am staying in Hyderabad";
	String[] str=s1.split(" ");
	String s2="Hyderabad";
	boolean isFound=false;
	for(int i=0;i<str.length;i++)
	{
		if(str[i].equals(s2))
		{
		isFound=true;
		break;
		}
	}
	if(isFound)
	{
		System.out.println(s2+"=>The give word is presented in the string");
	}
	else
		System.out.println(s2+"=>The give word is Not presented in the string");	
}
@Test
public void giveWordIsPresentOrNot_Use_Scanner()
{
	String s1="Nagender Harish Ram Sathish";
    String[] str=s1.split(" ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String word=sc.nextLine();
    boolean wd=false;
    for(int i=0;i<str.length;i++)
    {
        //char ch=str.charAt(i);
        if(word.equals(str[i]))
        {
            wd=true;
            break;
        }
    }
    if(wd==true)
    {
        System.out.println(word+"=> Is Present");
    }else
    System.out.println(word+"=> Is not Present");
}
}
