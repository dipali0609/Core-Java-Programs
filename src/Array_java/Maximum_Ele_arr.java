package Array_java;

import java.util.Scanner;

public class Maximum_Ele_arr
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit ::");
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	int max=arr[0];
	System.out.println("enter the Array elements::");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]>max)
		{
			max=arr[i];
		}
		
	}
	System.out.println(max);
}
}
