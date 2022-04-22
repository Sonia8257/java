import java.util.Scanner;
public class VotingEleg{
public static void main (String [] args)
{
Scanner sc  = new Scanner(System.in);
System.out.println("ENTER YOUR AGE : ");
int age = sc.nextInt();
String a = "candidate not elgible for voting";
String b = "candidate is eligible for voting";
String vot ;
vot = (age<18) ? a :b ;
System.out.println(vot);
}
}
