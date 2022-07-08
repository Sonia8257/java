//creating a hashmap,displaying and iterating it
package executor;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		
		//creating objects for the HashMap
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		
		h.put(1,"java");
		h.put(3,"c++");
		h.put(4,"python");
		h.put(2,"c");
		
		System.out.println(h);
		
		//to get element from a particular index 
		String a = h.get(3);
		
		System.out.println("The value of a particular key value is :" +a);
		
		//Iterating the HashMap using enhanced for loop
		
		for(Map.Entry a1 : h.entrySet())
		{
			System.out.println("key : "+a1.getKey()+ " value : "+a1.getValue());
		}
		
		 
	}

}
