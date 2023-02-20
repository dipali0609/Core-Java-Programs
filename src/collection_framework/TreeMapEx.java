package collection_framework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
public static void main(String[] args) {
	TreeMap<Long, String> T=new TreeMap<Long , String>();
	T.put(9834562723l,"Sonali");
	T.put(2568798098l,"Ritiksha");
	T.put(8785642145l,"Deepali");
	T.put(3768978576l,"Archana");
	T.put(8924679011l,"Laxmi");
	System.out.println(T);
	//travers Map elements
	for(Map.Entry<Long, String> pmap:T.entrySet())
	{
		System.out.println(pmap.getKey()+" "+pmap.getValue());
	}
}
}
