package com.Array_Programs;

import java.util.Arrays;

public class Z2_Add_Two_Matrix 
{
		public static void main(String[] args) 
		{
			
			int a[][]= {{1,2},{3,4}};
			int b[][]= {{1,1},{2,1}};
			
			int c[][]=new int[a.length][b[0].length];
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println(Arrays.deepToString(c));
		}
	}

