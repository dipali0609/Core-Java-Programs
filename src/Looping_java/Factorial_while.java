package Looping_java;

import java.util.Scanner;

public class Factorial_while 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no:");
	int n=sc.nextInt();
	int i=1,f=1;
	while(i<=n)
	{
		f=f*i;
		i++;
	}
	System.out.println("Factorial::"+f);
}
}
