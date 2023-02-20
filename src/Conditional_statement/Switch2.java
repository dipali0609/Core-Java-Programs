package Conditional_statement;
import java.util.*;
public class Switch2
{
public static void main(String[] args) 
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter no a nad b");
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Enter the choice:");
int choice=sc.nextInt();

switch(choice)
{
case 1:System.out.println("Addition::"+(a+b));
break;

case 2:System.out.println("Substraction::"+(a-b));
break;

case 3:System.out.println("Multiplication::"+(a*b));
break;

case 4:System.out.println("Division::"+(a/b));
break;

default:System.out.println("Invalid Output");

}
}
}
