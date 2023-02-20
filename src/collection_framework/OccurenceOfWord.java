package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWord 
{
	static void word(String inputStr)
	{
		HashMap<String, Integer> map=new HashMap<>();
		
		String[] str=inputStr.split(" ");
		
		for(String S:str)
		{
			if(map.containsKey(S))
			{
				map.put(S, map.get(S)+1);
			}
			else
			{
				map.put(S, 1);
			}
		}
		
		for(Map.Entry<String, Integer> pmap:map.entrySet())
		{
			System.out.println(pmap.getKey()+"->"+pmap.getValue());
		}
		
	}
public static void main(String[] args) {
	String inputStr="Java Python cpp Java cpp Html";
	word(inputStr);
}
}
