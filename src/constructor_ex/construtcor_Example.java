package constructor_ex;

public class construtcor_Example 
{
	int t=30;
	public construtcor_Example() 
	{
	t=20;	
	}
	
	int x,y;
	public construtcor_Example(int a,int b)
	{
		x=a;
		y=b;
	}
public static void main(String[] args) {
       construtcor_Example ob=new construtcor_Example();
       System.out.println(ob.t);
}
}
