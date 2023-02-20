package Pattern_java;

public class N_To_One_Pattern 
{
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
