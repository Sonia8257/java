import java.util.Scanner;
public class SwapExp{
static public  void main (String [] args)
{
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int b = sc.nextInt();
System.out.println("numbers before swapping" +a + " " +b);
a = a+b;
b = a-b;
a = a-b;
System.out.println("numbers after swapping " +a + " " +b);

}
}