package Conditional_statement;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
       System.out.println("enter the no::");
       int n=sc.nextInt();
       if(n%2==0)
       {
    	 System.out.println("No is even");  
       }
       else
       {
    	   System.out.println("No is odd");  
       }
	}

}
