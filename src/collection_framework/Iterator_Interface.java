package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterator_Interface 
{
public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(12);
	ls.add(99);
	ls.add(13);
	ls.add(34);
	ls.add(45);
	System.out.println(ls);
	
	Iterator I=ls.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	Collections.sort(ls);
	System.out.println(ls);
	
	Collections.reverse(ls);
    System.out.println(ls);	
    
    System.out.println("Before Swapping"+ls);
    Collections.swap(ls,2,3);
    System.out.println("After Swapping="+ls);
    
    Collections.replaceAll(ls, 99, 120);
    System.out.println(ls);
	
}
}
