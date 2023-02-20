package Conditional_statement;
import java.util.*;
public class Switch_info 
{
public static void main(String[] args) 
{
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value between 1 to 6");
choice=sc.nextInt();

switch(choice)
{
case 1:System.out.println("Sunday");
break;

case 2:System.out.println("Monday");
break;

case 3:System.out.println("Tuesday");
break;

case 4:System.out.println("Thursday");
break;

case 5:System.out.println("Friday");
break;

case 6:System.out.println("Saturday");
break;

}
}
}
