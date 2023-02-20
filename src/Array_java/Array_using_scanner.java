package Array_java;

import java.util.Scanner;

public class Array_using_scanner
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	System.out.println("enter the elements::");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	
	for(int i=0;i<arr.length;i++)
	{
		
		System.out.println(arr[i]);
	}

	
}
}
