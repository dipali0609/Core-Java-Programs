package Java_operator;
import java.util.*;
public class Arithmatic_operator {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
	          int eng;
	          int hindi;
	          int science;
	          int sst;
	          int maths;
	          int comp;
	          
	          System.out.println("Enter the english Marks::");
	          eng=sc.nextInt();
	          
	          System.out.println("Enter the hindi Marks::");
	          hindi=sc.nextInt();
	          
	          System.out.println("Enter the Science Marks::");
	          science=sc.nextInt();
	          
	          System.out.println("Enter the sst Marks::");
	          sst=sc.nextInt();
	          
	          System.out.println("Enter the maths Marks::");
	          maths=sc.nextInt();
	          
	          System.out.println("Enter the comp Marks::");
	          comp=sc.nextInt();
	          
	          int total;
	          total=eng+hindi+science+sst+maths+comp;
	          
	          System.out.println("Total Marks:="+total/6);
	          
		}

	}


