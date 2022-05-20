
import java.util.Scanner;
public class FactRecursion {
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
		int a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER:");
		a=sc.nextInt();
		System.out.println("Factorial of "+a+ "is" +fact(a));		
		

	}

}
