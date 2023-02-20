package Inheritance;
class polygone
{
	protected int height;
	protected int width;
	
	public void set_Values(int a,int b)
	{
		height=a;
		width=b;
	}
}

class reactangle extends polygone
{
	public double area()
	{
		return (height*width);
	}
}

class tringle extends polygone
{
	public double area()
	{
		return (height*width)/2;
	}
}
public class shapes 
{
public static void main(String[] args) 
{
	reactangle ob=new reactangle();
	tringle ob1=new tringle();
	
	ob.set_Values(10, 10);
	ob1.set_Values(10, 10);
	
	System.out.println("rectangle area="+ob.area());
	System.out.println("tringle area="+ob1.area());
}
}
