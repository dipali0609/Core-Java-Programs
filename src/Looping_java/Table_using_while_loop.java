package Looping_java;

import java.util.Scanner;

public class Table_using_while_loop 
{
public static void main(String[] args) {
	int i=1,t=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the N::");
	int n=sc.nextInt();
	while(i<=10)
	{
		t=n*i;
		System.out.println(n+"X"+i+"="+t);
		i++;
	}
}
}
