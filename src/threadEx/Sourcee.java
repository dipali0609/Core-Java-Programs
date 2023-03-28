package threadEx;


import java.util.function.Supplier;

import java.util.stream.*;

interface StringAPI
{
	boolean addString(String s, String p);
}

public class Sourcee {
	
	
//		public boolean validate(String username,String Password)
//		{
//			Supplier<Stream<String>> stream = () -> Stream.of(username, Password);
//			return ((Stream<String>) stream).anyMatch(str ->username.equals("ABC")) && ((Stream<String>) stream).anyMatch(str ->Password.equals("DEF"));
//			
//	
//		 
//			
//		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         Sourcee ob=new Sourcee();
//         System.out.println(ob.validate("ABC", "DEF"));
         String SS="ABC";
          String PP="DEF";
         
        
         StringAPI obj=(s,p)->
         {
			return s.toString().chars().allMatch(str->s.equals(SS) && p.equals(PP));
        	 
         };
         System.out.println(obj.addString("ABC","DEF"));
	}

}
