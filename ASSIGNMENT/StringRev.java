import java.util.Scanner;
public class StringRev{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
String s ;
System.out.println("Enter s string : ");
s = sc.nextLine();
String rev = "" ;

for(int i =s.length()-1; i>=0; i--)
{
 rev = rev+s.charAt(i);
} 
System.out.println("the reversed string is  " +rev);
}
}