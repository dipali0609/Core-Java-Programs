

//public class Name_1000 
//{
//	public static void name(int n)
//	{
//		
//		if(n>0)
//		{
//			System.out.println("dipali="+n);
//			n--;
//			name(n);
//			
//		}
//	}
//public static void main(String[] args) {
//	         name(100);
//} 
//}

public class Name_1000 
{
	public static void name(int n)
	{
		
		if(n<=100)
		{
			System.out.println("dipali");
			n++;
			name(n);
			
		}
	}
public static void main(String[] args) {
	         name(1);
} 
}