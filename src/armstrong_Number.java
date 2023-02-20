import java.util.Scanner;

public class armstrong_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int num=sc.nextInt();
		int copynum, digitCount=0,digit,sum=0;
		copynum=num;
		 while(copynum>0)//153
		 {
			 digitCount++;
			 copynum=copynum/10;
		 }
		 
		 copynum=num;
		 while(copynum>0)
		 {
			 digit=copynum%10;//153%10=3
			 sum=sum+(int)Math.pow(digit, digitCount);
			 copynum=copynum/10;
		 }
		 
		 if(num==sum)
		 {
			 System.out.println("Y");
		 }
		 else
		 {
			 System.out.println("N");
		 }
		
	}
}
