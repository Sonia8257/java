import java.util.Scanner;
class Largestinarray
{
public static void main (String [] args)
{

int a[] = new int [6];
Scanner sc = new Scanner(System.in);
System.out.println("Enter array elemnets : ");
for(int i = 0; i< 6 ; i++)
{
a[i]= sc.nextInt();
}
int max = a[0];
for (int i = 1 ; i<5 ; i++)
{
if (a[i]>max)
{ 
max = a[i];
}

}
System.out.println("largest element is : " +max);
}
}

