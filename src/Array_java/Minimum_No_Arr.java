package Array_java;

import java.util.Scanner;

public class Minimum_No_Arr 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit ::");
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	
	System.out.println("enter the Array elements::");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	System.out.println(min);
}
}
