package classes_Object_Method;

class method
{
	public void sum1()
	{
		System.out.println("Sum1="+(50+30));
	}
	public int sum2()
	{
		return(10+30);
	}
	public void sum3(int a,int b)
	{
		System.out.println("Sum3="+(a+b));
	}
	public int sum4(int a,int b)
	{
		return(a+b);
	}
	
}
public class Method_Types
{
public static void main(String[] args) 
{
	method ob1=new method();
	ob1.sum1();
	int result=ob1.sum2();
	System.out.println("Sum2="+result);
	
	ob1.sum3(100,200);
	
	System.out.println("Sum4="+ob1.sum4(400,200));
	
	
}
}
