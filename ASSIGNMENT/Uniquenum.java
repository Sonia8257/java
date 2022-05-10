import java.util.Scanner;
class Uniquenum
{
public static void main (String [] args)
{
int count = 0;
Scanner sc = new Scanner (System.in);
System.out.println("ENTER A NUMBER :  " );
int num = sc.nextInt();
int n1 = num;
int n2=num;
while(n1>0)
{
int r1 = n1%10;
while (n2>=0)
{
int r2 = n2%10;
n2 = n2/10;
}
n1 = n1/10;
}
if(r1==r2)
{
count++;
}
if (count == 1)
{
System.out.println(+num+ "  is a unique number ");
}
else
{
System.out.println(+num+ "  is not a unique number ");
}
}
}



