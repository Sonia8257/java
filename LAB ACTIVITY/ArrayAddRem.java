import java.util.Arrays;
import java.util.*;

class ArrayAddRem
{
public static void main (String [] args)
{

int a [] = {8,9,3,2,5,4,1} ;
System.out.println("Array elements before insertion : " +(Arrays.toString(a)));
int l = a.length();
int newarr [] =  new int [l+1];
System.out.println("Add an element : ");
int elem = sc.nextInt();
for( int i = 0 ;i<l+1 ; i++)
{
newarr[i]= a[i];
}
newarr[l+1]= elem;
System.out.println ("Array elements after insertionof element : " +( Arrays.toString(newarr)));
System.out.println("Array after removing an element : ");
for( int i = 0 ;i<l ; i++)
{
newarr[i]= newarr[i+1];
}
System.out.println(Arrays.toString(newarr));
}
}


