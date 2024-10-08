package pattranPrograms;

public class Rambose_Pat2 {
public static void main(String[] args) {
	int n=7;
	for(int i=1;i<=n;i++)
	{
		
		for(int j=1;j<=n;j++)
		{
			if(i+j >= ((n+1)/2) +1 && i-j <=n/2 && i+j <=n+(n+1)/2 && j-i <= n/2)
			{
				System.out.print("*");
			}
			System.out.print("  ");
		}
		System.out.println();
	}
}
}
