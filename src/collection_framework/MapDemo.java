package collection_framework;

import java.util.*;
public class MapDemo 
{
public static void main(String[] args) {
	Map<Integer,String> num=new HashMap<>();
	num.put(11, "Apple");
	num.put(22, "Orange");
	num.put(33, "PineApple");
	num.put(44, "Banana");
	num.put(55, "Grapes");
	num.put(66, "Gauva");
	
	
	System.out.println(num);
	System.out.println("Keys of Map::"+num.keySet());
	System.out.println("Values of Map::"+num.values());
	System.out.println("entries on the map:"+num.entrySet());
	
	String value=num.remove(55);
	System.out.println("deleted value is::"+value);
	System.out.println("Entris on the map::"+num.entrySet());
	
	
	
	
	
	
	
	
	
	
	
	
//	Map<String,Integer> num=new HashMap<>();
//	num.put("One", 1);
//	num.put("Two", 2);
//	num.put("Three",3);
//	num.put("four", 4);
//	num.put("five", 5);
//	//num.put("five", 9);
//	
//	System.out.println(num);
//	System.out.println("Keys of Map::"+num.keySet());
//	System.out.println("Values of Map::"+num.values());
//	System.out.println("entries on the map:"+num.entrySet());
//	
//	int value=num.remove("four");
//	System.out.println("deleted value is::"+value);
//	System.out.println("Entris on the map::"+num.entrySet());
	
}
}
