package polymorpism;
class method_overoading1
{
	public void show()
	{
		System.out.println("Hii i am default");
	}
	public void show(int a)
	{
		
		System.out.println("Value of A is:"+a);
	}
	
	public void show(double a)
	{
		System.out.println("Value of double a is:"+a);
	}
	public void show(int a, double b)
	{
		System.out.println("Value of A and B is::"+a+" "+b);
	}
	public void show(double a,int b)
	{
		System.out.println("Value of A and B is::"+a+" "+b);
	}
}
public class Method_Overloading
{
	public static void main(String[] args) {
	method_overoading1 ob=new method_overoading1();
	ob.show();
	ob.show(10);
	ob.show(2.1);
	ob.show(20, 3.2);
	ob.show(3.6, 40);
}
}
