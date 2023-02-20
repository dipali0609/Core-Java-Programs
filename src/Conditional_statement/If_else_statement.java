package Conditional_statement;
import java.util.*;
public class If_else_statement 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age;
	
	System.out.println("Enetr the age::");
	age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("eligible for vote");
	}
	else
	{
		System.out.println("not eligible");
	}
}
}
