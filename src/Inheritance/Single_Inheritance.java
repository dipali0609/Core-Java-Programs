package Inheritance;

class A
{
public void am()
{
	System.out.println("i am parents class method:");
}

}

class B extends A
{
	public void pm()
	{
		System.out.println("I am child class method:");
	}
}
public class Single_Inheritance 
{
public static void main(String[] args) {
	B ob=new B();
	ob.am();
	ob.pm();
	//ob.pm();
	
	
}
}
