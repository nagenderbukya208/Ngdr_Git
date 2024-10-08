package com.Array_Programs;

import org.testng.annotations.Test;

public class Z4_Transpose_Of_Matrix 
{
public static void main(String[] args) {
		
		int a[][]= {{1,2},{5,4}};
		int r=a.length;
		int c=a[0].length;
		
		int tran[][]=new int[r][c];
		
		for (int i = 0; i <a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				tran[i][j]=a[j][i];
			}
			
		}
		for(int is[]:tran)
		{
			for(int s:is)
			{
				System.out.print(s+" ");
			}
			System.out.println( );
		}		
	}

@Test
public void trans()
{
	int a[][]= {{1,2},{5,4}};
	int b[][]=new int [a[0].length][a.length];
	for(int i=0;i<a[0].length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			b[i][j]=a[j][i];
			System.out.print(b[i][j]+" ");
			
		}
		System.out.println();
	}
}
}
