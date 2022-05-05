import java.util.Scanner;
class Student  {
String name;
static String college =  " Peri Institute Of Technology";
int roll_no;
void input()
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter Student Name : ");
name = sc.nextLine();
System.out.println("Enter Student Roll Number :  ");
roll_no = sc.nextInt();
}
void disp()
{
System.out.println("      Student details      ");
System.out.println("Student Name :  " + name );
System.out.println("Student Rollno :  " + roll_no );
System.out.println("College Name :  " + college);
}
public static void main (String [] args)
{
Student s = new Student ();
s.input();
s.disp();
}
}



