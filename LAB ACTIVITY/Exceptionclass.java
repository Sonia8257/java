package assignment;
import java.util.Scanner;
public class Exceptionclass {
	void add(int a , int b)
	{
		int sum = a+b;
		if (sum <100)
		{
			System.out.println("ANS :" +sum);
		}
		else
		{
		throw new ArithmeticException("Sum is greater thean 100");
		
			
		}
				}


	

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("ENTER ANY TWO NUMBERS ;");
int a = sc.nextInt();
int b = sc.nextInt();
Exceptionclass e = new Exceptionclass ();
e.add(a,b);


	}
}

