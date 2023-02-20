package Array_java;

import java.util.Scanner;

public class Array_Mul 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Limit Of array::");
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	int arr1[]=new int[n];
	
	System.out.println("Enetr the first Array elements 1::");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enetr the Second Array elements 2::");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
	}
	
	System.out.println("first Array Elements 1:: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	System.out.println("Second Array Elements 2:: ");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	
	System.out.println();
	System.out.println("Sum Of 2 Array::");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]*arr1[i]+" ");
	}
	
	
	
	
}
}
