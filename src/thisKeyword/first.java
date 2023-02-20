package thisKeyword;

class This
{
	int i;
	public void method(int i)
	{
		this.i=i;
	}
	public void display()
	{
		System.out.println("Value of i="+i);
	}
}
public class first 
{
	public static void main(String[] args) {
		
		
		This obj=new This();
		obj.method(10);
		obj.display();
	}
}
