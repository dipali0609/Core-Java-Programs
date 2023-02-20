package exceptions;

public class ArrayIndex {
public static void main(String[] args) {
	try
	{
//		int a[]={1,2,3,4};
//		System.out.println(a[5]);
		String str=null;
		System.out.println(str.charAt(0));
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{ 
	System.out.println(e);
	}
	
	finally
	{
		System.out.println("Finally Block");
	}
}
}
