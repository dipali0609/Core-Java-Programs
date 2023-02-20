package Inheritance;

class A1
{
	public void am()
	{
		System.out.println("Class A method:");
	}
} 
class B1 extends A1
{
	public void pm()
	{
		System.out.println("Class B Method");
	}
}

class C1 extends A1
{
	public void gm()
	{
		System.out.println("Class C Method");
	}
}
public class Hierarchical_Inheritance 
{
public static void main(String[] args) {
	A1 ob=new A1();
	ob.am();
	
	B1 ob1=new B1();
	ob1.am();
	ob1.pm();
	
	C1 ob2=new C1();
	ob2.am();
	ob2.gm();
	
	
	
}
}
