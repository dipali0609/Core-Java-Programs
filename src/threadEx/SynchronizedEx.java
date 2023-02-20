package threadEx;
class PrintTable
{
	 synchronized void multiplication(int num)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(num+"X"+i+"="+num*i);
	}
	}
}

class Table1 extends Thread
{
	int num1;
	PrintTable t;
	Table1(PrintTable tob)
	{
		this.t=tob;
	}
	public void run()
	{
		t.multiplication(2);
	}
}

class Table2 extends Thread
{
	int num1;
	PrintTable t;
	Table2(PrintTable tob)
	{
		this.t=tob;
	}
	public void run()
	{
		t.multiplication(5);
	}
}

public class SynchronizedEx 
{
	public static void main(String[] args) throws InterruptedException {
		PrintTable t=new PrintTable();
		Table1 t1=new Table1(t);
		Table2 t2=new Table2(t);
		t1.start();
		//t1.join();
		t2.start();

	}

}
