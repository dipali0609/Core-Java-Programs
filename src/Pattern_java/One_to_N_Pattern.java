package Pattern_java;

public class One_to_N_Pattern 
{
public static void main(String[] args)
{
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
System.out.println();
}
}
}
