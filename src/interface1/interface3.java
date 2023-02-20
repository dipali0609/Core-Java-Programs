package interface1;

interface A
{
	int a=20;
}
class B implements A
{
	int a=40;
}
class C extends B
{
	int a=50;
}
public class interface3 
{
public static void main(String[] args) {
A ob=new B();
System.out.println(ob.a);
B ob1=new B();
System.out.println(ob1.a);

A obj3=new C();
System.out.println(obj3.a);


}
}
//method access type of object
//variable access type of reference