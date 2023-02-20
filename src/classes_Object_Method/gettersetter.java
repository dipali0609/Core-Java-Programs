package classes_Object_Method;

class method1
{
String name;
int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
public class gettersetter 
{
public static void main(String[] args) {
	method1 ob=new method1();
	ob.setName("Dipali");
	System.out.println(ob.getName());
	
	ob.setAge(23);
	System.out.println(ob.getAge());
}
}
