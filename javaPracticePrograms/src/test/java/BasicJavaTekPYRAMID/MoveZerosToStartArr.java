package BasicJavaTekPYRAMID;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveZerosToStartArr {
@Test
public void moveZeros() {
	Object[] arr= {'a','b',0,'c',0};
	int last=arr.length-1;
	for(int i=arr.length-1;i>=0;i--) {
		if(!(arr[i].equals(0)))
		{
		 Object temp=arr[last];
		 arr[last]=arr[i];
		 arr[i]=temp;
		 last--;			
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
