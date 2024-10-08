package pattranPrograms;

public class Num_Left_Triangle {
public static void main(String[] args) {
	int n=9;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j%2);
		}
		System.out.println();
	}
}
}
