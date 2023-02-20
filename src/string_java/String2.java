package string_java;

public class String2 
{
public static void main(String[] args) {
	String s1="Dipali"+5+5;
	String s2="Dipali"+'5'+'5';
	String s3="Dipali"+(5+5);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	System.out.println();
	String s4=5+5+"Dipali";
	System.out.println(s4);
	
	String s5='5'+'5'+"Dipali";
	System.out.println(s4);
	
	String s6=(5+5)+"Dipali";
	System.out.println(s4);
	
	String s7="Java"+"java"+"pythoon";
	System.out.println("Concate String::"+s7);
}
}
