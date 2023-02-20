package interface1;
interface D
{
	public abstract void drawshape();
	
}
class DS implements D
{

	@Override
	public void drawshape() {
		// TODO Auto-generated method stub
		System.out.println("I am Drawshape method");
	}

	
	
}

public class inteface6 
{
public static void main(String[] args)
{
	DS obj=new DS();
	obj.drawshape();
}
}
