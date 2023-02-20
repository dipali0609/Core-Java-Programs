package Conditional_statement;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) 
	{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no a nad b");
	a=sc.nextInt();
	b=sc.nextInt();

	System.out.println("Enter the choice:");
	String choice=sc.next();

	switch(choice)
	{
	case "Add":System.out.println("Addition::"+(a+b));
	break;

	case "Sub":System.out.println("Substraction::"+(a-b));
	break;

	case "Mul":System.out.println("Multiplication::"+(a*b));
	break;

	case "div":System.out.println("Division::"+(a/b));
	break;

	default:System.out.println("Invalid Output");

	}
	}
}
