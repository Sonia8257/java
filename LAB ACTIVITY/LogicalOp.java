import java.util.Scanner;
public class LogicalOp{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THREE NUMBERS: ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if ((a>b) && (b<c))
{
int d = a+b*c;
System.out.println("result of AND operator"+d);
if ((a>=b) || (c>a))
{
int e = a-b/c;
System.out.println("result of OR operator " +e);

if(!(a==0))
{
System.out.println("result of NOR" +a);
}
}
}
else
{
System.out.println ("value of a is 0");
}
}
}
