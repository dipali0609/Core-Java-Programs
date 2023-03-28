
public class String_Buffer 
{
public static void main(String[] args)
{
	StringBuffer s1=new StringBuffer("Edubridge learning");
	
	
	System.out.println(s1);
	
	s1=s1.append("Private limited");
	
	System.out.println(s1);
	
	s1.insert(11, "JAVA");
	System.out.println(s1);
}
}
