package Corejavaprogrames;

public class PerfectNo_whileloop
{
public static void main(String[] args) 
{
int n=28;
int num=n,sum=0;
int i=1;
while(i<=n/2)
{
	if(n%i==0)
	{
		System.out.println(i);
		sum=sum+i;
		
	}
	i++;
}

if(num==sum)
{
	System.out.println("Perfect No");
}
else
{
	System.out.println("Not");
}
}
}
