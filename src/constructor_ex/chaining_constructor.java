package constructor_ex;

public class chaining_constructor 
{
	public chaining_constructor() 
	{
		this(5);
		System.out.println("first cons");
	}
    public chaining_constructor(int a)
    {
    	this(10,20);
    	System.out.println("second cons="+a);
    	
    }
    public chaining_constructor(int a,int b)
    {
    	System.out.println("third cons="+(a+b));
    }
    int chaining_constructor ()
    {
    	return 0;
    }
public static void main(String[] args)
{
new chaining_constructor();	
}
}
