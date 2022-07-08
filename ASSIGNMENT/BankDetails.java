//implementation of  the bank details using the user output and using interfaces and abstraction
package executor;

import java.util.Scanner;

interface Bank
{
	
	void display();
     default float input_details( String bank,float SI, float principal , float year)
    {
    	
    	 System.out.println("   BANK DETAILS ");
 	
		System.out.println("Bank : "+bank);
		
 		return principal;
		
		
	
 		
    }
}

class Details implements Bank
{
    
     public void dsplay() {
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
	

public class BankDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
  	  System.out.println("ENTER YOUR BANK NAME : ");
  	  String bank ; 
  	  bank = sc.nextLine();
    	System.out.println("SIMPLE INTEREST : ");
    	float SI = 0.00f;
    	SI = sc.nextFloat();
    	
    	System.out.println("PRINCLE : ");
    	float principal = 0.00f;
    	principal = sc.nextFloat();
    	
    	System.out.println("YEARS : ");
    	float year = 0.00f;
    	year = sc.nextFloat();

    	
    	Details d = new Details();
    	d.dsplay();
    	d.input_details(bank,SI,principal,year);
    	float rate_of_intertest = 0.00f;
		 rate_of_intertest = ((principal*year*SI)/100);
		System.out.println("Rate of interest is : ");
    	
		

}
}





