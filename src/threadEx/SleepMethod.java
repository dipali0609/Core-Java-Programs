package threadEx;
class Slepp extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Under Run Method");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class SleepMethod
{
public static void main(String[] args) {
	Slepp ob=new Slepp();
	ob.start();
}
}
                                