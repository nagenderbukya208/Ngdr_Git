package com.Array_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Z1_Add_Two_Matrix_2 
{
	@Test
	public void add() {		
		int r=2;
		int c=2;
		int  a[][]=new int[r][c];
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=i+j;
				b[i][j]=i+j;				
			}			
		}
//		System.out.println(Arrays.deepToString(a));
//		System.out.println(Arrays.deepToString(b));	
		int res[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				res[i][j]=a[i][j]+b[i][j];				
			}
		}		
		System.out.println(Arrays.deepToString(res));
	}

}
