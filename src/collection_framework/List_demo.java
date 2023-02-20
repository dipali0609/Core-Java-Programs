package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class List_demo 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);	
System.out.println("enter the Limit::N");
int n=sc.nextInt();
ArrayList<Integer> ls=new ArrayList<>();
System.out.println("enter the Arraylist element::");
for(int i=0;i<n;i++)
{
	int no=sc.nextInt();
	ls.add(no);
}
System.out.println("ArrayList Elemets ara::");
Iterator<Integer> I=ls.iterator();
while(I.hasNext())
{
	System.out.println(I.next());
}
}
}
