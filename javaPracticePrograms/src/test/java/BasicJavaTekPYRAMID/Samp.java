package BasicJavaTekPYRAMID;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Samp {
@Test
public void swapFirstHalfAndSecoHalf() {
	int a[]= {1,2,3,4,5,6,7,8};
	int mid=a.length/2;
	for(int i=0;i<mid;i++)
	{
		if(a.length%2==0) 
		{
		int temp=a[i];
		a[i]=a[mid+i];
		a[mid+i]=temp;
	  }else
	  {
		  int temp=a[i];
		  a[i]=a[mid+i+1];
		  a[mid+i+1]=temp;
	  }
   }
	System.out.println(Arrays.toString(a));
}
@Test
public void LargestEleInArr() {
	int a[]= {1,2,3,4,13,5,6,7,88,8,9};
	int temp=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>temp) {
          temp=a[i];
		}		
	}
	System.out.println(temp);
 }
}












