package string_java;

public class Split_Method 
{
public static void main(String[] args) 
{
String s="edubridge@learning@private@limited";

String s1[]=s.split("@");

System.out.println("Using for each loop::");
for(String i:s1)
{
	System.out.println(i);
}
System.out.println();
System.out.println("Using for loop::");
for(int i=0;i<s1.length;i++)

{
	System.out.println(s1[i]);
}


}
}
