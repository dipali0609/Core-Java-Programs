public class Pattern1
{
	
	static 
	{
		System.out.println("static");
	}
	{
		System.out.println("annonymons block");
	}
	Pattern1()
	{
		System.out.println("constructor");
	}

	
	public static void main(String[] args) 
	{
		
			System.out.println("Main");
			Pattern1 ob=new Pattern1();
			float val=8.6f;//we need to write "f" otherwise it will shows compile time error	
		}	
}
