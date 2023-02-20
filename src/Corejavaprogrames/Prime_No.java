package Corejavaprogrames;
//A prime no is a number is number that is greter than one or divisble by 1 or itself 3,5,7,11,13,17,19,23,29...etc
public class Prime_No
{
public static void main(String[] args) 
{
	int num=3;
	boolean flag=false;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			flag=true;
			break;
		}
	}
	if(!flag)
	{
		System.out.println("Prime no ");
	}
	else
	{
		System.out.println("not prime no");
	}
	
}
}
