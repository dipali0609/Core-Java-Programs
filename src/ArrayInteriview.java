
public class ArrayInteriview
{
public static void main(String[] args)
{
	int a[]=new int[4];
	a[0]=45;
	a[1]=90;
	a[2]=45;
	a[3]=56;
	
//	int b[]=new int[4];
//	 for(int i=0;i<a.length;i++)
//	 {
//		 System.out.println("A array:"+a[i]);
//	 }
//	 b=a;
//	 for(int i=0;i<b.length;i++)
//	 {
//		 System.out.println("B array:"+b[i]);
//	 }
//	 
//	 for(int i=b.length-1;i>=0;i--)
//	 {
//		 System.out.println("B array:"+b[i]);
//	 }
//	 
	int b[]=a.clone();
	for(int i=b.length-1;i>=0;i--)
		 {
			 System.out.println("B array:"+b[i]);
		 }
}
}
