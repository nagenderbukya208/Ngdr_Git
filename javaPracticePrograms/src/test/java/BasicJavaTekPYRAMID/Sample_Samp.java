package BasicJavaTekPYRAMID;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Samp {
@Test(dataProvider = "getData")
public void sample(int [] a)
{
System.out.println(Arrays.toString(a));
}
@DataProvider
public Object[][] getData()
{
	Object[][] arr=new Object[2][2];
	arr[0][0]=10;
	arr[0][1]=20;
	arr[1][0]=30;
	arr[1][1]=40;
	return arr;
}
}
