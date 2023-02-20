package Array_java;

import java.util.Scanner;

public class Ascending_Order 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit ::");
	int n=sc.nextInt();
	
	int[] a=new int[n];
	int temp,count=0;
	System.out.println("enter the Array elements::");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
		
	}
	
}
}
