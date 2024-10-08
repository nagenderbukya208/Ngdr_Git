package com.Array_Programs;

public class Missing_Num_Arr
{
public static void main(String[] args) 
{
	boolean status=true;
	int a[]= {3,6,9,7,10};
	for(int i=1;i<=10;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(i==a[j])
			{
				status=false;
				break;
			}
		}
		if(status==true)
		{
		System.out.println(i);
	    }
	status=true;
	}
}
}
