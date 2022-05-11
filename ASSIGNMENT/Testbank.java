class Bank
{
void interest()
{
System.out.println("  WELCOME TO BANK PORTAL   ");
}
}
class Axis extends Bank
{
void interest()
{
super.interest();
System.out.println("Welcome Axis to bank portal");
}
}
class Icici extends Bank
{
void interest()
{
System.out.println("Welcome Icici to bank portal");
}
}
public class Testbank
{
public static void main (String [] args)
{

Icici i = new Icici();
i.interest();
Axis a = new Axis();
a.interest();
}
}

