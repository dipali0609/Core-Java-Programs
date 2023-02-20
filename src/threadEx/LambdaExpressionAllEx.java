package threadEx;

interface Addition3
{
	void add();
	default void disp()
	{
		System.out.println("I am Display Method:");
	}
	public static void disp1()
	{
		System.out.println("I am Static Method:");
	}
}
interface Substraction
{
	void sub(int i,int j);
}
interface Multiplication
{
	int Mul(int i, int j);
}
public class LambdaExpressionAllEx 
{
public static void main(String[] args) 
{
   Addition3 Aob=()->
   {
	  
	   System.out.println("Addition="+(4+1));
   };
   Aob.add();
   Aob.disp();
   Addition3.disp1();
   
   Substraction Sob=(i,j)->
   {
	   System.out.println("Subtraction="+(i-j));
   };
   Sob.sub(6,2);
   
   Multiplication Mob=(i,j)->i*j;
  System.out.println("Multiplication="+Mob.Mul(5,2));
}
}
