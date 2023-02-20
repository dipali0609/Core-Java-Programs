package encapsulation;
class capsule
{
	private int a;
	private double b;
	private String c;
	protected int d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
}
public class Part1
{
public static void main(String[] args) 
{
	capsule ob=new capsule();

	ob.setA(20);
	ob.setB(323678);
	ob.setC("Dipali");
	System.out.println(ob.getA());
	System.out.println(ob.getB());
	System.out.println(ob.getC());
	System.out.println(ob.d);
	
}
}
