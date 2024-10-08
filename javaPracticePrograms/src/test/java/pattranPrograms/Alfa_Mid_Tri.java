package pattranPrograms;

public class Alfa_Mid_Tri {
 public static void main(String[] args) {
	 int n=9;
	    char letter;
	    for(int i=0;i<n;i++)
	    {
	        letter='A';
	        for(int j=n-1;j>i;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print(letter+" ");
	            letter++;
	        }
	        System.out.println();
	    }
}
}
