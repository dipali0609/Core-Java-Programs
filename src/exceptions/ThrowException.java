package exceptions;

import java.util.Scanner;

class youngerage extends RuntimeException
{
	public youngerage(String msg) 
	{
		super(msg);
	}
}
public class ThrowException 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	try
	{
	if(age<18)
	{
		throw new youngerage("Person is not eligible to vote");
	}
	else
	{
		System.out.println("person is eligible to vote");
	}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("Hello");
}
}
