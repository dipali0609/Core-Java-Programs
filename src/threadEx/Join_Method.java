package threadEx;

public class Join_Method extends Thread
{
	
	public void run()
	{
		try
		{
			
			for(int i=0;i<5;i++)
			{
				System.out.println("Child thread:"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) throws InterruptedException {
	Join_Method ob=new Join_Method();
	

	ob.start();
	ob.join();	
	try
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread:"+i);
			Thread.sleep(1000);
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}
