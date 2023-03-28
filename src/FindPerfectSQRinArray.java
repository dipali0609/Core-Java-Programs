
public class FindPerfectSQRinArray {
	public static boolean sqrt(int a[])
	{
		boolean bool=false;
		//boolean bool1=true;
		int b;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			//System.out.println(a[i]);
			b=(int)Math.sqrt(a[i]);
			
			//System.out.println(b);
			if(a[i]==b*b)
			{
				
				bool= true;
			}
			else
			{
				
				bool=false;
				break;
			}
			
			
		}
		
		return bool	;
	}
public static void main(String[] arg)
{
	int a[]=new int[4];
	a[0]=25;
	a[1]=16;
	a[2]=4;
	a[3]=25;
	
	System.out.println(sqrt(a));
	
	
	
}
}
