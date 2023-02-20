import java.util.Scanner;

public class Armstrong_No 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Number From User::");
	int num=sc.nextInt();
	int copynum, Count=0,digit,sum=0;
	copynum=num;
	 while(copynum>0)
	 {
		 copynum=copynum/10;
		 Count++;
	 }
	 
	 copynum=num;
	 while(copynum>0)
	 {
		 digit=copynum%10;
		 sum=sum+(int)Math.pow(digit, Count);
		 copynum=copynum/10;
	 }
	 
	 if(num==sum)
	 {
		 System.out.println("Number is Armstrong");
	 }
	 else
	 {
		 System.out.println("Number is not Armstrong");
	 }
	
}
}
