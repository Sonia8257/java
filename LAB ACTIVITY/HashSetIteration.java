package executor;
//Iterating HashSet Elements With And Without Iterator
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("zeus");
		h.add("shinchan");
		h.add("doraemon");
		h.add("ninja");
		h.add("pooh");
		
		//Iterating using iterator
		Iterator<String> i = h.iterator();
		
		System.out.println("   ITERATING USING ITERATOR");
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("   ITERATING WITHOUT ITERATOR");	
	//normal iteration without iterator
		for(String a : h)
		{
			System.out.println(a);
		}

	}

}
