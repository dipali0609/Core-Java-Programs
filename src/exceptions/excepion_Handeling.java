package exceptions;

public class excepion_Handeling
{
public static void main(String[] args) 
{
	try
	{
	int x=20;
	int y=0;
	int z=x/y;
	System.out.println(z);
	
	}
    catch(Exception e)
	{
	System.out.println(e);
	}
}
}
