
import java.util.Scanner;

public class No_div 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the no:");
int n=sc.nextInt();
if((n%3==0) && (n%5==0))
{
System.out.println("num is div by 3 and 5 both");	
}
else if(n%3==0)
{
	System.out.println("num is div by 3");
}
else if(n%5==0)
{
	System.out.println("num is div by 5");
}
else
{
	System.out.println("it is div by another num");
}
}
}
