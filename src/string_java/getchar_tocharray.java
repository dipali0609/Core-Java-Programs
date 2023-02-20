package string_java;

import java.util.Arrays;

public class getchar_tocharray
{
public static void main(String[] args) {
	String s1="Java";
	char dest[]=new char[4];
	s1.getChars(0, 4, dest,0);
	System.out.println(Arrays.toString(dest));
	
	int i;
	String s2="edubridge";
	char c[]=s2.toCharArray();
	for(i=0;i<s2.length();i++)
	{
		System.out.print(c[i]+"\t");
	}
}
}
