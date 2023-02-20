package interface1;
interface I
{
	public abstract void show();
	void display();
}
class CS implements I,Interface
{
	public void show()
	{
		System.out.println("Hii i am show mwthod:");
	}
	public void display()
	{
		System.out.println("Hello");
	}
	public void show(int a)
	{
		
	}
	@Override
	public void Sum(int a ,int b) {
		// TODO Auto-generated method stub
		System.out.println("sum is::"+(a+b));
	}
}
public class Interface11 
{
public static void main(String[] args) 
{
	CS obj=new CS();
	obj.show();
	obj.display();
	obj.Sum(2, 4);
}
}
