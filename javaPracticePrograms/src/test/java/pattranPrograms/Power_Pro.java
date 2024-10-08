package pattranPrograms;

import java.util.Scanner;

public class Power_Pro {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a base value");
	int base=scan.nextInt();
	System.out.println("Enter a power value");
	int power=scan.nextInt();	
	int sum=1;
	for(int i=1;i<=power;i++)
	{
		sum=sum*base;
	}
	System.out.println(sum);
}
}
