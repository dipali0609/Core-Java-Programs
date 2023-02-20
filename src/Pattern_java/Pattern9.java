package Pattern_java;

import java.util.Scanner;

public class Pattern9 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the No");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
		for(int j=a-i;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		
	System.out.println();	
	}
	
	for(int i=1;i<=b;i++)
	{
		for(int j=b-i;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		
	System.out.println();	
	}
	
	for(int i=1;i<=c;i++)
	{
		for(int j=c-i;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		
	System.out.println();	
	}
}

}
