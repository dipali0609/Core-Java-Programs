package Conditional_statement;
import java.util.Scanner;
public class if_else_if
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Ente the no:");
int a=sc.nextInt();

if(a>0)
{
	System.out.println("no is positive:");
}
else if(a<0)
{
	System.out.println("no is negative:");
}
else
{
	System.out.println();
}
	
}
}
