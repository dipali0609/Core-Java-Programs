package Array_java;
import java.util.*;
public class Two_D_Addition
{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Row and Coloum Values");
			int row=sc.nextInt();
			int col=sc.nextInt();
			
			int a[][]=new int[row][col];
			int b[][]=new int[row][col];
		    System.out.println("Enter no of elements Array1");
		    for(int i=0;i<row;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    		a[i][j]=sc.nextInt();
		    	}
		    }
		    
		    System.out.println("Enter no of elements Array2");
		    for(int i=0;i<row;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    		b[i][j]=sc.nextInt();
		    	}
		    }
		    
		    int c[][]=new int[row][col];
		    for(int i=0;i<row;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    		c[i][j]=a[i][j]+b[i][j];
		    	}
		    }
		    System.out.println("Array1 elements::");
		    for(int i=0;i<row;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    	System.out.print("\t"+a[i][j]+"\t");
		    	}
		    	System.out.println();
		    }
		    
		    
		    System.out.println("Array2 elements::");
		    for(int i=0;i<row;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    	System.out.print("\t"+b[i][j]+"\t");
		    	}
		    	System.out.println();
		    }
		    
		    System.out.println("Additon Of two Array::");
		    for(int i=0;i<row;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    	System.out.print("\t"+c[i][j]+"\t");
		    	}
		    	System.out.println();
		    }
		    
		    
		    
		}

	}

