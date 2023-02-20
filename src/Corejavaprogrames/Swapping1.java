package Corejavaprogrames;

public class Swapping1 
{
public static void main(String[] args) {
	int a=10,b=20;
	
	System.out.println("before swapping A ::"+a);
    System.out.println("before swapping B::"+b);
	a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swapping A::"+a);
    System.out.println("after swapping B::"+b);
// String d="s";
 //System.out.println("d");
    
}
}
/*
a=a*b;
b=a/b;
a=a/b;
*/