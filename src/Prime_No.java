
public class Prime_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int i;
		
   for(i=1;i<=100;i++)
   {
	   int c=0;
	   for(int j=2;j<=i;j++)
	   {
		 if(i%j==0)
		 {
			 c++;
		 }
	   }
	   if(c==2)
	   System.out.println(i);
   }
	}

}
