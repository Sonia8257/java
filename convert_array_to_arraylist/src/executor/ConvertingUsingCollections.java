package executor;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertingUsingCollections {
public static void main(String[] args) {
		
		//creating a array of type String and intializing on compile time
				String stud[] = {"Shinchan","kasama","boo","masaov"};
				
				//Creating ArrayList
				ArrayList<String> s= new ArrayList<String>();
				
				//converting array into arraylist using Collections
				Collections.addAll(s,stud);
				
				//adding elements in arraylist
				s.add("michchi");
				System.out.println("ArraysList is ");
				
				
				//using advanced for loop for iterating throught elements
				for(String b:s)
				{
					System.out.println(b);
				}
				
	}

}
