package assignment;
import java.util.Scanner;
public class FactRecurNonecur {
	
	 static int fact(int a)
	 {
		 if(a==1)
		 {
			return (1); 
		 }
		 else
		 {
			 return (a*fact(a-1));
		 }
	 }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBERS ;");
		int a = sc.nextInt();
		int fact=1;
		for(int i = fact ; i<=a;i++)
		{
			 fact = fact*i;		
		}
		System.out.println("Factorial without recursion: "+fact);
		System.out.println("Factorial with recursion: "+fact(a));
		
		
		
		FactRecurNonecur	r = new FactRecurNonecur();
	
	
		
	}

}
