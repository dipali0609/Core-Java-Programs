package collection_framework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQue 
{
public static void main(String[] args) {
	PriorityQueue<String> Q=new PriorityQueue<>();
	Q.add("Dipali");
	Q.add("Apple");
	Q.add("Zebra");
	Q.add("Banana");
	Q.add("Sonali");
	Q.add("Apple");
	System.out.println(Q);
	Iterator<String> I=Q.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	
	Q.remove();
	Q.poll();
	System.out.println("After removing elements:");
	Iterator<String> I1=Q.iterator();
	while(I1.hasNext())
	{
		System.out.println(I1.next());
	}
}
}
