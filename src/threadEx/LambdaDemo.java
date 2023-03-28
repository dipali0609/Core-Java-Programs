package threadEx;
interface A
{
	//void show(String s);
	void show(int i,int j);
}
//class B implements A
//{
//
//	@Override
//	public void show(i,j) {
//		// TODO Auto-generated method stub
//		System.out.println("Welcome");
//	}
//	
//}
public class LambdaDemo
{
public static void main(String[] args) 
{
//A obj;
//obj=()->System.out.println("Welcome");
//obj.show();

//obj=(s)->System.out.println(s);
//obj.show("Dipali");
 
A obj=(i,j)->
{
    System.out.println("Addition ="+(i+j));	
};
obj.show(7,8);


obj=(i,j)->System.out.println("Addition is="+(i+j));
obj.show(4,6);


}
}
