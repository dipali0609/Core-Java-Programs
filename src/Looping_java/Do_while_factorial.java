package Looping_java;

public class Do_while_factorial 
{
public static void main(String[] args) {
	int no=5;
	int i=1,t=1;
	do
	{
	t=t*i;	
	i++;
	}while(i<=no);
	System.out.println(t);
}
}
