package com.Array_Programs;

	import java.util.Arrays;

import org.testng.annotations.Test;
	public class SwapAnArrFirstHf {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        System.out.println("Original Array: " + Arrays.toString(arr));      
	        swapArrayHalves(arr);	        
	        System.out.println("Modified Array: " + Arrays.toString(arr));
	    }	    
	    public static void swapArrayHalves(int[] arr) {
	        int length = arr.length;	        
	        if (length % 2 != 0) {
	            System.out.println("Array length must be even for this operation.");
	            return;
	        }	        
	        int halfLength = length / 2;	        
	        // Swap elements between first half and second half
	        for (int i = 0; i < halfLength; i++) {
	            int temp = arr[i];
	            arr[i] = arr[halfLength + i];
	            arr[halfLength + i] = temp;
	        }
	        	
	  }
//*********************************************************
	    @Test
		public void swapHalfArray3() {
			int[] arr = { 1, 2, 3, 4, 5, 6};
			int midpoint = arr.length / 2;
			for (int i = 0; i < midpoint; i++) {
				if(arr.length%2==0) {
					// if length is even
					int temp = arr[midpoint + i];
					arr[midpoint + i] = arr[i];
					arr[i] = temp;
				}
				else {
					// if length is odd
					int temp = arr[midpoint + i+1];
					arr[midpoint + i+1] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.print(Arrays.toString(arr));
		}
	}