package interface1;
interface One{
	void add();
	default void msg() {
		System.out.println("Message function1");
	}
}
interface Two{
	default void msg() {
		System.out.println("Message function2");
	}
}
class MessageClass implements One,Two{

	@Override
	public void add() {
		System.out.println("add method");
		
	}

	@Override
	public void msg() {
		
		One.super.msg();
		Two.super.msg();
	}
	
	
}
public class Two_I_Having_same_method_Name {


	public static void main(String[] args) {
		MessageClass mob=new MessageClass();
		mob.msg();

	}


}
