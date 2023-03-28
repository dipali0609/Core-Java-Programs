package threadEx;

import java.util.stream.Collectors;

interface StringAPIEX
{
	String addString(String s);
}

public class Source 
{
	public String insertStr(String s)
	{
		return s.toString().chars().mapToObj(c->(char)c+"")				
					.collect(Collectors.joining()).trim();
		
	   //return s.replace("", " ").trim();
//		return (str)->
//		{
//			return s.toString().chars().mapToObj(c->(char)c+" ")
//		
//				.collect(Collectors.joining()).trim();
//		  
//		};
		
//		return s.toString().chars().mapToObj(e->(char)e+" ").collect(Collectors.joining());
	}
public static void main(String[] args)
{
  java.util.Scanner sc=new java.util.Scanner(System.in);
    String ss=sc.next();
	Source ob=new Source();
	String str=ob.insertStr("Dipali");
	System.out.println(str);
	System.out.println("dip");
	}
}
