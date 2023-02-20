package Corejavaprogrames;
/*
class staticvar
{
	static int a=100;
	static int b=200;
	
}
public class Static_Variable 
{
public static void main(String[] args) 
{
	staticvar obj=new staticvar();
	System.out.println(staticvar.a);
	System.out.println(staticvar.b);
	
}
}
*/
class staticvar
{
	static int a;
	static int b;
	
}
public class Static_Variable 
{
public static void main(String[] args) 
{
	staticvar obj=new staticvar();
	staticvar.a=100;
	staticvar.b=200;
	System.out.println(staticvar.a);
	System.out.println(staticvar.b);
	
}
}

