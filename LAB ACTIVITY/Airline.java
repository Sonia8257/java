import java.util.Scanner;

public class Airline {

	public static void main(String[] args) {
		int weight;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Luggage weight : ");
		weight = s.nextInt();
		if (weight>20)
		{
			
		
			try {
			 throw new ArithmeticException();
				
				}
			
			catch (ArithmeticException e)
			{
				System.out.println("LUGGAGE MORE THAN 20 KG IS NOT ALLOWED");
				
			}
			
	}
		else
		
			System.out.println("please drop your luggage before bording");
		
	}
	
		}
		
		
