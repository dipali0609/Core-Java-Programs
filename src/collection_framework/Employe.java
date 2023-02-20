package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Employee
{   
	int emp_id;
	String emp_Name;
    double emp_Salary;
	Employee(int emp_id, String emp_Name, double emp_Salary)
	{
		this.emp_id=emp_id;
		this.emp_Name=emp_Name;
		this.emp_Salary=emp_Salary;
	}
}
	
	class EmployeeSalary implements Comparator<Employee>
	{
		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			if(e1.emp_Salary==e2.emp_Salary)
				return 0;
			else if(e1.emp_Salary>e2.emp_Salary)
				
			return 1;
			else
			return -1;
		}	
	}
	
	class EmployeeID implements Comparator<Employee>
	{
        @Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			if(e1.emp_id==e2.emp_id)
				return 0;
			else if(e1.emp_id>e2.emp_id)
				
			return 1;
			else
			return -1;
		}		
	}
	
class EmployeeName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.emp_Name.compareTo(o2.emp_Name);
	}
	
}
public class Employe 
{	
public static void main(String[] args) {
	ArrayList<Employee> l1=new ArrayList<Employee>();
	System.out.println("Id\tBook_Name\t Book_Author\tBook_Publisher\tquantity");
	Employee es=new Employee(12, "Deepalee", 1434);
	Employee es1=new Employee(10, "Samiksha", 1211);
	Employee es2=new Employee(99, "Pranalee", 1299);
	Employee es3=new Employee(11, "Kshitija", 1111);
	Employee es4=new Employee(17, "Shitalll", 5678);
	
	l1.add(es);
	l1.add(es1);
	l1.add(es2);
	l1.add(es3);
	l1.add(es4);
	
	System.out.println("before sort:");
	java.util.Iterator<Employee> I1=l1.iterator();
	while(I1.hasNext())
	{
		Employee emp=I1.next();
		System.out.println(emp.emp_id+"\t"+emp.emp_Name+"\t"+emp.emp_Salary);
	}
	
	//sort employee Salary
	EmployeeSalary esort=new EmployeeSalary();
	Collections.sort(l1,esort);
	System.out.println("After sort By emp_Salary:");
	java.util.Iterator<Employee> I=l1.iterator();
	while(I.hasNext())
	{
		Employee emp=I.next();
		System.out.println(emp.emp_id+"\t"+emp.emp_Name+"\t"+emp.emp_Salary);
	}
	
	//sort employee ID
		EmployeeID esort1=new EmployeeID();
		Collections.sort(l1,esort1);
		System.out.println("After sort By emp_ID:");
		java.util.Iterator<Employee> I2=l1.iterator();
		while(I2.hasNext())
		{
			Employee emp=I2.next();
			System.out.println(emp.emp_id+"\t"+emp.emp_Name+"\t"+emp.emp_Salary);
		}
		
		//sort employee Name
				EmployeeName esort2=new EmployeeName();
				Collections.sort(l1,esort2);
				System.out.println("After sort By emp_Name:");
				java.util.Iterator<Employee> I3=l1.iterator();
				while(I3.hasNext())
				{
					Employee emp=I3.next();
					System.out.println(emp.emp_id+"\t"+emp.emp_Name+"\t"+emp.emp_Salary);
				}
	
}
}

