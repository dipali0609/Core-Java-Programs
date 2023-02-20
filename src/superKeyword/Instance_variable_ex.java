package superKeyword;
class key1
{
	int a=10;
	
}
class key2 extends key1
{
	int a=20;
//	key2(int a)
//	{
//	   this.a=a;
//	}
	public void show(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
//	public void show()
//	{
//		System.out.println(super.a);
//		System.out.println(this.a);
//	}
}
public class Instance_variable_ex 
{
public static void main(String[] args) {
	key2 obj=new key2();
	obj.show(30);
	//obj.show();
}
}
