package Pattern_java;

public class Pascle_Left_tringle_Pattern 
{
public static void main(String[] args) 
{
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=n-i;j>=1;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print("*");
	}
	System.out.println();
}

for(int i=1;i<=n-1;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=n-1;k>=i;k--)
	{
		System.out.print("*");
	}
	System.out.println();
}
}
}
