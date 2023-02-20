package string_java;

public class CompareTo 
{
public static void main(String[] args) 
{
String s1="dinesh";
String s2="dinesh";
String s3="Dinesh";
String s4="ratan";

System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s3));//false

System.out.println(s1.equalsIgnoreCase(s2));//true
System.out.println(s1.equalsIgnoreCase(s3));//true

System.out.println(s1==s2);//true
System.out.println(s1==s3);//false

System.out.println("CompareTO Method::");
System.out.println(s1.compareTo(s2));//0
System.out.println(s1.compareTo(s3));//32
System.out.println(s1.compareTo(s4));//-14

System.out.println(s1.compareToIgnoreCase(s3));//0
System.out.println(s3.compareToIgnoreCase(s1));//0
System.out.println(s3.compareToIgnoreCase(s4));//-14

System.out.println(s3.compareTo(s4));//-46
}
}
