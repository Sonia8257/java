//Implementing HashSet  
package executor;
import java.util.HashSet;

public class TestHashset {

	public static void main (String [] args)
	
	{
		// creating an object for hashset
		HashSet<Integer> i = new HashSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(6);
		
        //printing hashset
		System.out.println(i);
		
	    //cloning the HashSet
	    i.clone();
	    System.out.println(i);
	    
	    
	    //total size of the HashSet
	    System.out.println(i.size());
	    
		//Deleting all elements from HashSet
	    i.clear();
		System.out.println(i);
		
		
		
		
		
		
		
	}
}
