package threadEx;
class employee
{
	
}
class demo extends employee implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("Inside run method"+Thread.currentThread());
		}
	}
	
}
public class RunnabbleUses
{
public static void main(String[] args) {
	demo ob=new demo();
	
	Thread tob=new Thread(ob);
	tob.setName("t1");
	tob.start();
	
    demo ob1=new demo();
	
	Thread tob1=new Thread(ob1);
	tob1.setName("t2");
	tob1.start();
	

}
}
