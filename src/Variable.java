
public class Variable 
{
	int a;
	float b;
	String c;

public static void main(String[] args)
{
	int x;
	float y;
	
	Variable ob=new Variable();
	//System.out.println(x);//when we try to access local variable without 
	//System.out.println(y);//initialized then it will shows the compile time error
	System.out.println(ob.a);//when we try to access instance variable without initialized then
	System.out.println(ob.b);//it will return the default value of that variable
	System.out.println(ob.c);
	
}
}
