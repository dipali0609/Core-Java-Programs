
public class StringEx {

	public static void main(String[] args)
	{
		String str="DIpali";
	 for(int i=0;i<str.length();i++)
	 {
		 System.out.println("char of index"+i+"is"+str.charAt(i));
	 }
	 System.out.println(str.charAt(0));
	 System.out.println(str.codePointAt(3));
     System.out.println("----------------------");	 
	 String s1="Dipali";
	 String s2="Dipali";
	 System.out.println(s1==s2);
	 String s3=new String("Sachin");
	 System.out.println(s1==s3);
	 System.out.println(s1.contains("Dip"));
	 
	 System.out.println("----------------------");
	 String str1="com.xml";
	 String str2="com.xml";
	 String str3=new String("com.xml");
	 System.out.println(str1.contentEquals(str2));
	 System.out.println(str1.contentEquals(str3));
	 System.out.println("-----------------------");
	 
     System.out.println(str1.equals(str2));
     System.out.println(str.equals(str3));
     
     System.out.println("-----------------------");
     System.out.println("convert String into array");
     char stri[]=str.toCharArray();
     for(int i=0;i<str.length();i++)
     {
    	System.out.println(stri[i]); 
     }
	 
	 String s="";
	 System.out.println(s.length());
	 
	 System.out.println("-----------------------");
	 String a="Java is most Popular languages ";
	 System.out.println("substring");
	 System.out.println(a.substring(8,12));
	 System.out.println(a.substring(0,4));
	}

}
