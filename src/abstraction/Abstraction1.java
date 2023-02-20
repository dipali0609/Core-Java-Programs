package abstraction;

abstract class vehicle
{
	abstract void start();
	abstract void demo();
	final void demooo()
	{
		
	}
}
class Scooter extends vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("starts with kick:");
	}

	@Override
	void demo() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
class car extends vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("start with key");
	}

	@Override
	void demo() {
		// TODO Auto-generated method stub
		System.out.println("Hiii");
	}
	
}
public class Abstraction1 
{
public static void main(String[] args) {
	Scooter ob=new Scooter();
	ob.start();
	ob.demo();
	
	car ob1=new car();
	ob1.start();
	ob.demo();
}
}
