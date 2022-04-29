import java.util.Scanner;
public class Bike{
String bno;
String name;
int days;
int charge;

public void input()
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter bike number :  " );
bno = sc.nextLine();
System.out.println("Enter bike name :  " );
name = sc.nextLine();
System.out.println("Enter the days to rent :  " );
days = sc.nextInt();
}
public void compute()
{
if (days<=5)
{
int charge = days*500;}
else if (days<=10)
{
charge = 5*500+(days-5)*400;
}
else 
{
charge = 5*500+5*400+(days-10)*200;
}
}
void disp()
{
System.out.println("Bike number :  " +bno);
System.out.println("Bike name :  "+name );
System.out.println("No : of days rented :  "+days );
System.out.println("Amount Charged :  "+charge );
}
public static void main (String [] args)
{
Bike b = new Bike();
b.input();
b.compute();
b.disp();
}
}