package Corejavaprogrames;

public class Series_Lucus 
{
	public static void main(String[] args) {

    int a=1,b=1,c=1,d;
    int n=10;
    System.out.print(a+" "+b+" "+c+" ");
    
    for(int i=0;i<n;i++)
    {
    	d=a+b+c;
    	System.out.print(d+" ");
    	a=b;
    	b=c;
    	c=d;
    }
	}

}
