import java.lang.String;
import java.util.Scanner;
class Stringmethods
{
public static void main (String [] args)
{
String a , b = " ";
Scanner sc = new Scanner(System.in);
System.out.println("ENTER TWO STRING VALUES :   ");
a = sc.nextLine();
b = sc.nextLine();
System.out.println("length of the string A :  "+(a.length()));
System.out.println("Cancatenation of two strings :  "+(a.concat(b)));
System.out.println("Comparing of two strings :  "+(a.compareTo(b)));
System.out.println("Is A eqauls to B :  "+(a.equals(b)));
System.out.println("Substring of A :  "+(a.substring(2)));
System.out.println("Uppercase of A is :  "+(a.toUpperCase()));
System.out.println("Lowercase of A is :  "+(a.toLowerCase()));
System.out.println("Uppercase of B is :  "+(b.toUpperCase()));
System.out.println("Lowercase of B is :  "+(b.toLowerCase()));
}
}