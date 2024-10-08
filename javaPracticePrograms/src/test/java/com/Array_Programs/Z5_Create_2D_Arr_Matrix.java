package com.Array_Programs;

import java.util.Arrays;

public class Z5_Create_2D_Arr_Matrix 
{
	public static void main(String[] args) {
		int row=2;
		int col=2;
		int  a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=i+j;
				
			}
			
		}
		System.out.println(Arrays.deepToString(a));
	}
}
