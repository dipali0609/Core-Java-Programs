
public class demo 
{
public static void main(String[] args) {
	char c=65;
	System.out.println(c);
	String t="hiheyhello";
	int index=t.lastIndexOf("h",4);
	System.out.println(index);
	String s1="Dipali";
	String s2=new String("Dipali");
	String s3="Dipali";
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	
	
}
}
