package Inheritance;

class AA
{
	
	public void am()
	{
		//private a;
		System.out.println("I am A class Method:");
	}
}

class BB extends AA
{
	public void pm()
	{
		System.out.println("I am B class Method:");
	}
}

class CC extends BB
{
	public void gm()
	{
		System.out.println("I am C class Method:");
	}
}

public class Multilevel_Inheritance 
{
public static void main(String[] args) 
{
//	AA ob1=new AA();
//	ob1.am();
//	
//	BB ob2=new BB();
//	ob2.am();
//	ob2.pm();
//	
	CC ob=new CC();
	ob.am();
	ob.pm();
	ob.gm();
	
}
}
