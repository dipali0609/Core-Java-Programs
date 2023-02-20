package collection_framework;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist_operation 
{
public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<Integer>();
	ArrayList<Integer> l2=new ArrayList<Integer>();

	//Add Method in l1 Arraylist
	l1.add(29);
	l1.add(12);
	l1.add(14);
	l1.add(29);
	System.out.println("Arraylist L1="+l1);

	//Add Method in l1 Arraylist
	l2.add(234);
	l2.add(67);
	l2.add(77);
	l2.add(67);
	l2.add(90);
	System.out.println("Arraylist L2="+l2);

	//add With Index Number
	l1.add(0,77);
	System.out.println(l1);

	//Return maximum elements in Arrayliat
	System.out.println("Maximing="+Collections.max(l2));

	//Sorting elemts
	Collections.sort(l2);
	System.out.println("After sorting="+l2);

	//Remove from List
	l1.remove(3);
	System.out.println("After removing from index 3="+l1);

	//Remove Method
	l1.remove(Integer.valueOf(14));

	//Set Method
	l1.set(0, 111);
	System.out.println(l1);

	l1.addAll(l2);
	System.out.println("After Adding l2 in l1="+l1);

	//size Of Arraylist
	System.out.println("Size of L1="+l1.size());
	System.out.println("Size of L2="+l2.size());

	//contains All
	System.out.println("Contains All="+l1.containsAll(l2));
	System.out.println("Contains Method="+l1.contains(12));


	//contains Method
	System.out.println(l1.contains(12));
	System.out.println(l1.equals(l2));

	System.out.println("Original="+l2);
	//clone Method
	l2.clone();
	System.out.println("Clone="+l2);

	//return the index of first occurence of the ele
	System.out.println("Index="+l1.indexOf(12));

	//return the index of last occurence of the ele
	System.out.println("Last Index="+l1.lastIndexOf(29));

	//hashCode Number
	System.out.println("Hashcode of l1="+l1.hashCode());
	System.out.println("Hashcode of l2="+l2.hashCode());

	//Remove all List
	System.out.println(l1.retainAll(l2));
	System.out.println(l1);

	//clear all elements in list
	l2.clear();
	System.out.println(l2);
}
}
