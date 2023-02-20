package constructor_ex;
class cons
{
	public cons()
	{
		System.out.println("This is no args cons:");
		int a=10,b=20;
		System.out.println(a+b);
	}
}
public class No_arg_constructor {
public static void main(String[] args) {
	cons ob=new cons();
	System.out.println("hiii");
	cons ob1=new cons();
}
}
