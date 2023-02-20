package Array_java;

import java.util.Scanner;

public class Merge
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	int arr1[]=new int[n];
	int sum[]=new int[n];
	System.out.println("enter the elements of array1::");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	
	System.out.println("enter the elements of array2::");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
		
	}
	System.out.print("Element of first Array1::");
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");	
	}
	System.out.println();
	System.out.print("Element of Second Array2::");
	System.out.println();
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");	
	}
	int d=0;
	int c=arr.length+arr1.length;
	int k=0;
	int c1[]=new int[c];
	for(int i=0;i<arr.length;c++,k++)
	{
		c1[k]=arr[i];
	}
	
	for(int i=0;i<=arr.length;c++,k++)
	{
		c1[k]=arr1[i];
	}
	
	for(int i=0;i<c1.length;i++)
	{
		System.out.println(c1[i]);
		d++;
	}
	System.out.println(d);
	
}
}
