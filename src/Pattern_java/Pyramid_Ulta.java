package Pattern_java;

public class Pyramid_Ulta 
{
public static void main(String[] args) {
	int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
}
}
/*
1 1 1 1  
 2 2 2  
  3 3  
   4
*/