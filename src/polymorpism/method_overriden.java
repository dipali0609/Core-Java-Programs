package polymorpism;
class sun
{
 public void show()
 {
	 System.out.println("I am sun class method:");
 }
 public void show(int a)
 {
	 System.out.println("Vlaue of a is:"+a);
 }
}
class moon extends sun
{
	 public void show()
	 {
		 System.out.println("I am moon class method:");
	 }
	 public void show(int a)
	 {
		 System.out.println("Vlaue of a is:"+a);
	 }
}
public class method_overriden 
{
public static void main(String[] args) {
	sun ob=new sun();
	ob.show();
    ob.show(20);
    
    
	moon ob1=new moon();
	ob1.show();
	ob1.show(30);
	
	sun ob2=new moon();
	ob2.show();
	ob2.show(30);
	
	
	
	
	
	
	
}
}
