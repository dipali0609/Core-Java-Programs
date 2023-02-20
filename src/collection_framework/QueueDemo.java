package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<Integer> ou=new LinkedList<Integer>();
	ou.add(3);
	ou.add(45);
	ou.add(67);
	ou.add(78);
	ou.add(30);
	ou.add(30);
	
	System.out.println(ou);
	
	Queue<String> ouu=new LinkedList<String>();
	ouu.add("dipali");
	ouu.add("Ritiksha");
	ouu.add("Laxmi");
	ouu.add("Sonali");
	ouu.add("Prnali");
	System.out.println(ouu);
	
	
}
}
