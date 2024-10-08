package pattranPrograms;

public class Rambose_Number {
public static void main(String[] args) {
	int n=9;
	for(int i=1;i<=n;i++)
	{
		int temp=1;
		for(int j=1;j<=n;j++)
		{
			if(i+j >= ((n+1)/2) +1 && i-j <=n/2 && i+j <=n+(n+1)/2 && j-i <= n/2)
			{
				System.out.print(temp++);
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
