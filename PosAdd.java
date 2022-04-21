import java.util.Scanner;
public class PosAdd{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int c =0;
while(a>=0){
c = c+a;
System.out.println("Sum is" +c);
System.out.println("enter a number:");
a = sc.nextInt();
}

}
}
