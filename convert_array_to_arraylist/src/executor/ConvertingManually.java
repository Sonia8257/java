package executor;

import java.util.ArrayList;

public class ConvertingManually {

public static void main(String[] args) {
		
		//creating a array of type String and intializing on compile time
		String stud[] = {"Shinchan","kasama","boo","masaov"};
		
		//Creating ArrayList
		ArrayList<String> s= new ArrayList<String>();
		
		//converting manually using length and for loop
		for(int i = 0 ; i<stud.length ; i++)
		{
			s.add(stud[i]);
		}
		//adding elements in arraylist
		s.add("harrie");
		System.out.println("ArraysList is ");

		//using advanced for loop for iterating through elements
		for(String b:s)
		{
			System.out.println(b);
		}
		

	}

}
