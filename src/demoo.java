interface I
{
	//int k;//public static final, final variable is always initialized
	void mm();//public abstarct
}
class Parent implements I
{
	
	 public void mm()// we need to make method as public otherwise it will shows error
	{
		
	}
 public void display(){
           System.out.println("display method");
   }
}
public class demoo extends Parent{
	final int d=6;
  public void display()
  {
           System.out.println("display method");
   }
   public static void main(String args[]){
        System.out.println("main");
      demoo ob=new demoo();
      
     float val;
       val=1.2f;
       
       System.out.println(ob.d);
   }
}
