package Array_java;

import java.util.Scanner;

public class Swapping_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit Of Array::");
    int n=sc.nextInt();
    
    int arr[]=new int[n];
    int arr1[]=new int[n];
    
    System.out.println("Enter elements in first Array1");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
    
    System.out.println("Enter elements in Second Array2");
    for(int i=0;i<arr1.length;i++)
    {
    	arr1[i]=sc.nextInt();
    }
    int c;
    for(int i=0;i<arr.length;i++)
    {
    	c=arr[i];
    	arr[i]=arr1[i];
    	arr1[i]=c;
    }
    
    System.out.println("Values after Swapping Array1");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(arr[i]);
    }
    
    System.out.println("Values after Swapping Array2");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(arr1[i]);
    }
	}

}
