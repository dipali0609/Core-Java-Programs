package Pattern_java;

public class Pyramid_Pattern {
public static void main(String[] args) {
	int a=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=a-i;j>0;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
