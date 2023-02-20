package collection_framework;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo 
{
public static void main(String[] args) 
{
NavigableMap<Integer,String> map=new TreeMap<>();
map.put(1, "Java");
map.put(2, "Python");
map.put(3, "Javascript");
map.put(4, "C sharp");

System.out.println("Descending Order::"+map.descendingMap());
System.out.println("hashMap::"+map.headMap(2,true));
System.out.println("tailMap::"+map.tailMap(2,true));
System.out.println("submap::"+map.subMap(1, true,3,true));

HashMap<Integer, String> o=new HashMap<>();
o.put(1,"djh");
o.put(2,"hjj");
o.put(3,"h");
o.put(4,"ho");
o.put(5,"qwe");
System.out.println(o);

}
}
