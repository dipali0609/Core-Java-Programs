package Conditional_statement;
import java.util.*;
public class Check_no {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 2 number");
     int a=sc.nextInt();
     int b=sc.nextInt();
     
     if(a>b)
     {
    	 System.out.println("A:"+a+" is greter than B:"+b);
     }
     else
     {
    	 System.out.println("B:"+b+" is greter than A:"+a);
     }
	}

}
