package interface1;
interface X
{
	void m1();
	default void m3()
	{
	System.out.println("i am default method:");	
	}
}
class Y implements X
{
  public void m1()
  {
	  System.out.println("m1() from Y class");
  }
  
}
class Z implements X
{
	 public void m1()
	  {
		  System.out.println("m1() from Z class");
	  }
}
public class interface4 
{
public static void main(String[] args) {
	X obj=new Y();
	obj.m1();
	obj.m3();
}
}
