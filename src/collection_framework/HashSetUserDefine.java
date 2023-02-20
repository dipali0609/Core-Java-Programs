package collection_framework;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Student{
	int studentId;
	String studentName;
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}

class StudentIdSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.studentId==s2.studentId)
		   return 0;
		else if(s1.studentId>s2.studentId)
			return 1;
		else 
		
	
			return -1;
		
	}
}

public class HashSetUserDefine{

	public static void main(String[] args) {
		Student s1=new Student(1,"Savita");
		Student s2=new Student(2,"Laxmi");
		Student s3=new Student(5,"Madhuri");
		Student s4=new Student(3,"Ritiksha");
		
		//Set<Student> sset=new HashSet<Student>();
		//Set<Student> sset=new LinkedHashSet<Student>();
		Set<Student> sset=new TreeSet<Student>(new StudentIdSort());
		sset.add(s1);
		sset.add(s2);
		sset.add(s3);
		sset.add(s4);
		
		System.out.println(sset);
	}

}

