package collection_framework;
import java.util.ArrayList;
import java.util.Iterator;

public class List_Program 
{
public static void main(String[] args) 
{
ArrayList<String> ls=new ArrayList<>();
ArrayList<String> ls1=new ArrayList<>();

//Add elements in Arraylist
ls.add("Yellow");
ls.add("Pink");
ls.add("Blue");
ls.add("Black");
ls.add("White");
ls.add("Purple");
System.out.println(ls+"\n");

//iterate through all elemets in a arraylist
Iterator I=ls.iterator();
while(I.hasNext())
{
	System.out.println(I.next());
}
System.out.println();

//insert element into arraylist at first position
ls.add(0,"Orange");
System.out.println(ls+"\n");

//retrieve elements in specified Index
System.out.println(ls.get(5)+"\n");

//search elements in Arraylist
System.out.println(ls.contains("Black")+"\n");

//clone an array list to another arrayList
ls1=(ArrayList<String>)ls.clone();
System.out.println(ls1+"\n");

//check array is empty or not
System.out.println(ls.isEmpty()+"\n");

//replace the second elements of arraylist with specified index
ls.set(2,"Red");
System.out.println(ls);
}
}
