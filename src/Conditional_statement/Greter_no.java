package Conditional_statement;

import java.util.Scanner;

public class Greter_no 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the three no::");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

//if(a>b && a>c)
//{
//	System.out.println("A is greter");
//}
//if(b>a && b>c)
//{
//	System.out.println("B is greter");
//}
//if(c>a && c>b)
//{
//	System.out.println("C is greter");
//}


//if(a>b && a>c)
//{
//	System.out.println("A is greter");
//}
//else if(b>c)
//{
//	System.out.println("B is greter");
//}
//else 
//{
//	System.out.println("C is greter");
//}


//if(a>b)
//{
//	if(a>c)
//	{
//		System.out.println("A is greter");
//	}
//}
//if(b>a )
//{
//	if(b>c)
//	{
//		System.out.println("B is greter");
//	}
//	
//}
//if(c>a)
//{
//	if(c>b)
//	{
//		System.out.println("C is greter");
//	}
//}

if(a>b)
{
	if(a>c)
	{
		System.out.println("A is greter");
	}
}
else if(b>c)
{
	System.out.println("B is greter");
}
else
{
	System.out.println("C is greter");
}
}

}
