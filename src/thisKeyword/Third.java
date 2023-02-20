package thisKeyword;
class cons5
{
	cons5()
	{
		this(10);
		System.out.println("I am default cons");
	}
	cons5(int a)
	{
		//this();
		System.out.println("Value of a="+a);
	}
}
public class Third 
{
public static void main(String[] args)
{
	cons5 ob1=new cons5();
	//cons5 ob=new cons5(10);
	
}
}
