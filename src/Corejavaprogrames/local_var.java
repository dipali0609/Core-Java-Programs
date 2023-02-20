package Corejavaprogrames;

class localvar
{
	 static int c=20;
	public void localv()
	{
	    int a=10;
	    int b=20;
	    
	    System.out.println(a);
	    System.out.println(b);
	    
	}
	public void localv(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		
	}
}
public class local_var {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       localvar obj=new localvar();
       obj.localv();
       obj.localv(10,20);
       System.out.println(localvar.c);
	}

}
