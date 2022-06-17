package executor;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArray {
public static void main(String[] args) {
		
		
		//creating a array of type String and intializing on compile time
		String stud[] = {"Shinchan","kasama","boo","masaov"};
		
		//converting array into arraylist using Arrays
		ArrayList<String> s= new ArrayList<String>(Arrays.asList(stud));
	   
		//adding elements in arraylist
		s.add("miksi");
		s.add("neni");
		System.out.println("ArraysList is ");
		
		
		//using advanced for loop for iterating throught elements
		for(String b:s)
		{
			System.out.println(b);
		}
		
		
	
		

	}

}
