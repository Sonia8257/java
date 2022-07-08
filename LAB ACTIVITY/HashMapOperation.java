//Using all the methods under HASHMAP CLASS
package executor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapOperation {

	public static void main(String[] args) {
		
		//creating a hashmap
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		
		//adding elements to hashmap
		h.put(1,"python");
		h.put(20, "java");
		h.put(15,"c++");
		h.put(9,"DBMS");
		h.put(10,"SQL");
		
		System.out.println(h);
		
		//Iterating using while and iterator
		
		//creating object for iterator
		Iterator i = h.entrySet().iterator();
		
		while(i.hasNext())
		{
			Map.Entry a = (Map.Entry)i.next();
	
			System.out.println("Key : "+a.getKey()+ " value : "+a.getValue());
		}
		
		//to check whether the key or value present in the hashmap or not
		boolean b = h.containsKey(12);
		System.out.println("The Key 12 present in HasMap : "+b);
		
		boolean c = h.containsValue("java");
		System.out.println("The Value JAVA present in HasMap : "+c);
		 
		//removing elements from HashMap
		
		h.clear();
		System.out.println(h);
		
        
	}

}
