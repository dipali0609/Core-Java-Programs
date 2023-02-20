package collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;
class StudentDetails
{
	int id;
	String name;
	int age;
	public StudentDetails(int id,String name,int age )
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class DequeDemo 
{
public static void main(String[] args) {
	Deque<StudentDetails> QU=new ArrayDeque<>();
	StudentDetails s1=new StudentDetails(1,"Dipali",23);
	StudentDetails s2=new StudentDetails(2,"Ritiksha",23);
	StudentDetails s3=new StudentDetails(3,"Laxmi",23);
	StudentDetails s4=new StudentDetails(4,"Sonali",23);
	QU.add(s1);
	QU.add(s2);
	QU.add(s3);
	QU.add(s4);
	
	for(StudentDetails s:QU)
	{
		System.out.println(s.id+" "+s.name+" "+s.age);
	}
	   
	
}
}
