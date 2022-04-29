import java.util.*;
import java.util.Scanner;
public class Employee2{

int empno;
String name;
float salary, hra, da, it, gp;
Employee2()
{
empno=0;
name = "";
salary = 0.0f;
hra = 0.0f;
da = 0.0f;
it = 0.0f;
gp = 0.0f;
    }
public void initial()
{
Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee number=");
        empno = sc.nextInt();
        System.out.print("Enter name=");
        name = sc.next();
        System.out.print("Enter salary=");
        salary = sc.nextFloat();
}


public void compute()
{
hra = salary * 0.1f;
da = salary * 0.555f;
it = salary * 0.06f;
gp = salary + hra + da - it ;
}
public void disp()
{
System.out.println("Employee Number=  "+empno);
System.out.println();
System.out.println("Employee Name=  "+name);
System.out.println();
System.out.println("Basic pay=  "+salary);
System.out.println();        
System.out.println("Housing Rent Allowance=  "+hra);
System.out.println();    
System.out.println("Dearness Allowance=  "+da);
System.out.println();
System.out.println("Income Tax=  "+it);
System.out.println();
System.out.println("Grass pay=  "+gp);
}

public static void main (String [] args)
{

Employee2 e = new Employee2();
e.initial();
e.compute();

e.disp();
}
}