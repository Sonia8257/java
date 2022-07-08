//displaying Student details in ascending order using lambda expression
package executor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
	int rollno;
	String stud_name;
	//creating a parameterized costructor for class student
	public Student(int rollno, String stud_name)
	{
		super();
		this.rollno = rollno;
		this.stud_name = stud_name;
	}
	
}
public class StudLambda {

	public static void main(String[] args) {
		
		//creating a ArrayList
 List<Student> l = new ArrayList<Student>();
 l.add(new Student(1,"Ramesh"));
 l.add(new Student(1,"Suresh"));
 l.add(new Student(1,"Rajesh"));
 l.add(new Student(1,"Kamesh"));
 l.add(new Student(1,"Kunesh"));
 
 System.out.println("   STUDENT DEATILS    ");
 
 //sorting the given names using sort method under collection class
 Collections.sort(l,(r,n)-> {
	 return r.stud_name.compareTo(n.stud_name);
 });
 
 //using enhanced for loop for iterating  the student details in a order
for(Student s : l)
{
	System.out.println("ROLLNO : " +s.rollno+ " STUDENT NAME : "+s.stud_name);
}
	}

}
