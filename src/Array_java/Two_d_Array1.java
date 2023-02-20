package Array_java;

import java.util.Scanner;

public class Two_d_Array1
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Row and Coloum Values");
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	int a[][]=new int[row][col];
	
    System.out.println("Enter no of elements");
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<col;j++)
    	{
    		a[i][j]=sc.nextInt();
    	}
    }
    
    for(int i=0;i<row;i++)
    {
    	for(int j=0;j<col;j++)
    	{
    		System.out.print("\t"+a[i][j]+"\t");
    	}
    	System.out.println();
    }
}
}
