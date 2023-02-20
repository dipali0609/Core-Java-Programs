package threadEx;
	class Hello extends Thread{
		public void run() {
			for(int i=1;i<=5;i++) {
			System.out.println("display method "+Thread.currentThread());
			}
		}
	}	

public class MainApp 
{
public static void main(String[] args) throws InterruptedException
{
			System.out.println(Thread.currentThread()); //JVM
			Hello ob=new Hello();
			ob.setName("firstThread");
			System.out.println("before start thread"+ob.isAlive());
		    ob.start();
		    
		    System.out.println("before start thread"+ob.isAlive());
		    ob.join();
			Hello ob1=new Hello();
			ob1.setName("secondThread");
			ob1.start();
			System.out.println(ob1.getPriority());
			ob1.setPriority(10);
			
}

}

