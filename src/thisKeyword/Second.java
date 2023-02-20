package thisKeyword;
class method2
{
	public void display()
	{
		System.out.println("Hi i am display method");
	}
	public void show()
	{
		//display();If you don't use the this keyword, compiler automatically adds this keyword while invoking the method
		this.display();
	}
}
public class Second {
public static void main(String[] args) {
	method2 obj=new method2();
	obj.show();
}
}
