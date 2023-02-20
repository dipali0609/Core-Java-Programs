package Corejavaprogrames;
//A number whoose Sum Of factors is equal to the that no;
public class Perfect_No 
{
public static void main(String[] args) {
	int n=28,sum=0;
	int num=n;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(num==sum)
	{
		System.out.println("Perfect no");
	}
	else
	{
		System.out.println("Not");
	}
	
}
}
