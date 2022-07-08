//conversion of HashSet to Array 
package executor;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("zeus");
		h.add("shinchan");
		h.add("doraemon");
		h.add("ninja");
		h.add("pooh");
		
		System.out.println("HASHSET : "+h);
		
		//creating String array with same size as 	HashSet for conversion
	String str[] = new String[h.size()];
	 
	//adding elements from HashSet to Array
	h.toArray(str);
	
	System.out.println("ARRAY   :  ");
	
	for(String a : str)
	{
		System.out.println(a);
	}
	

	}

}
