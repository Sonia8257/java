class Employee
{
int empid;
String ename;
ine sal;
Employee(int e, String n)
{
empid= e;
ename=n;
}
Employee(int e,String n, int s)
{
empid = e;
ename=n;
sal=s;
}
void disp()
{
System.out.println(empid+ " " +ename+ "  " +sal);
}
public class Conoverload{
public static void main (String [] args)
{
Employee e = new Empployee(1,"ram",500);
Employee e1 = new Employee(2, " juju " ); 
e.disp();
e1.disp()
}
}
}
