package collection_framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Student1 
{
	int stud_id;
	String stud_name;
	int stud_fees;
	
	public void accept()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  stud_id");
		stud_id=sc.nextInt();
		System.out.println("enter the  stud_name");
		stud_name=sc.next();
		System.out.println("enter the  stud_fees");
		stud_fees=sc.nextInt();	
	}
}
	
//@Override
//	public String toString() {
//		return "Student_data [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_fees=" + stud_fees
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
	class StudentID implements Comparator<Student1>
	{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.stud_id==o2.stud_id)
			return 0;
		else if(o1.stud_id>o2.stud_id)
			return 1;
		else
					
		return -1;
	}
		
	}
	
	class StudentName implements Comparator<Student1>
	{

		@Override
		public int compare(Student1 o1, Student1 o2) {
			// TODO Auto-generated method stub
			return o1.stud_name.compareTo(o2.stud_name);
		}
		
	}
	
	class StudentFee implements Comparator<Student1>
	{

		@Override
		public int compare(Student1 o1, Student1 o2) {
			if(o1.stud_fees==o2.stud_fees)
			return 0;
			else if(o1.stud_fees>o2.stud_fees)
				return 1;
			else
				return -1;
		}
		
	}

public class Student_data
{
public static void main(String[] args) 
{
	//Scanner sc=new Scanner(System.in);
	LinkedList<Student1> ls=new LinkedList<>();
	
	for(int i=0;i<3;i++)
	{
		Student1 ob=new Student1();
		ob.accept();
		ls.add(ob);	
	}
	
	System.out.println("before Sort::");
	Iterator<Student1 > I=ls.iterator();
	while(I.hasNext())
	{
		Student1 stud=I.next();
		System.out.println(stud.stud_id+"\t"+stud.stud_name+"\t"+stud.stud_fees);
	
	}
	
	//Sort by stude id
	System.out.println("After Sort By Stud_ID::");
	StudentID sortID=new StudentID();
	Collections.sort(ls,sortID);
	Iterator<Student1> I1=ls.iterator();
	while(I1.hasNext())
	{
		Student1 stud=I1.next();
		System.out.println(stud.stud_id+"\t"+stud.stud_name+"\t"+stud.stud_fees);
	}
	
	
	//Sort by stude name
		System.out.println("After Sort By Stud_Name::");
		StudentName sortName=new StudentName();
		Collections.sort(ls,sortName);
		Iterator<Student1> I2=ls.iterator();
		while(I2.hasNext())
		{
			Student1 stud=I2.next();
			System.out.println(stud.stud_id+"\t"+stud.stud_name+"\t"+stud.stud_fees);
		}
		
		//Sort by stude fees
				System.out.println("After Sort By Stud_Fee::");
				StudentFee sortFee=new StudentFee();
				Collections.sort(ls,sortName);
				Iterator<Student1> I3=ls.iterator();
				while(I3.hasNext())
				{
					Student1 stud=I3.next();
					System.out.println(stud.stud_id+"\t"+stud.stud_name+"\t"+stud.stud_fees);
				}
				
}

}
