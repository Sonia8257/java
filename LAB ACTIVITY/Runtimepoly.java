//write program to implement runtime polymorphism 


class Details
{
void details()
{
System.out.println("STUDENT Details");
}
}
class Student extends Details
{
void details()
{
System.out.println("STUDENT NAME : Sonia");
}
}
class Rollno extends Details
{
void details()
{
System.out.println("STUDENT ROLLNO : 4097 ");
}
}
class Department extends Details
{
void details()
{
System.out.println("STUDENT DEPARTMENT : CSE ");
}
}
class Dob extends Details
{
void details()
{
System.out.println("STUDENT DOB : 09.05.2001 ");
}
}
class Runtimepoly
{
public static void main (String [] args)
{
Student s = new Student();
Rollno r = new Rollno();
Department d1= new Department();
Dob d = new Dob();
s.details();
r.details();
d1.details();
d.details();

}
}


        