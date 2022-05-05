import java.util.Scanner;

class Employee
{
String empname;
int salary;
void input()
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter Employee Name : ");
empname = sc.nextLine();
System.out.println("Enter Employee Salary : ");
salary = sc.nextInt();
}
}
class Permanent extends Employee
{
void disp()
{
double hike = 0.5;
System.out.println("Salary of permanent employee : " +(salary+(salary*hike)));
}
}
class Temporary extends Employee
{
void disp1()
{
double hike = 0.3;
System.out.println("Salary of temporary employee : " +(salary+(salary*hike)));
}
}
public class ProgrmHeirarch
{
public static void main (String args[])
{
Permanent p = new Permanent();
p.input();
p.disp();
Temporary t = new Temporary();
t.input();
t.disp1();

}
}
