package superKeyword;
class sub1
{
	sub1()
	{
		System.out.println("I am Parent");
	}
	public void m1()
	{
		System.out.println("Hii i am from class A");
	}
}
class sub2 extends sub1
{
	sub2()
	{
		//super();
		System.out.println("I am child");
	}
	public void m1()
	{
		System.out.println("hii i am from class B");
	}
	public void show()
	{
		super.m1();
		this.m1();
		System.out.println("hii i am display method");
	}
}
public class Method {
public static void main(String[] args) {
	sub2 ob=new sub2();
	ob.show();
}
}
