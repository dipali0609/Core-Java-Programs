package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetExample 
{
public static void main(String[] args) 
{
HashSet<Integer> hs=new HashSet<>();
hs.add(90);
hs.add(19);
hs.add(34);
hs.add(78);
hs.add(345);
hs.add(12);
hs.add(1);
hs.add(34);
hs.add(70);
hs.add(null);
hs.add(null);

System.out.println(hs);

TreeSet<Integer> Ts=new TreeSet<>();
Ts.add(90);
Ts.add(19);
Ts.add(34);
Ts.add(78);
Ts.add(345);
Ts.add(12);
Ts.add(1);
Ts.add(34);
Ts.add(70);
System.out.println(Ts);

Iterator<Integer> I=Ts.descendingIterator();
while(I.hasNext())
{
	System.out.println(I.next());
}

}
}
