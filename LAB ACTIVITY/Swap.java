public class SwapExp{
static public  void main (String [] args)
{
int a = 10, b =12;
System.out.println("numbers before swapping" +a + " " +b);
a = a+b;
b = a-b;
a = a-b;
System.out.println("numbers after swapping " +a + " " +b);

}
}