package executor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(91);
		s.add(20);
		s.add(55);
		s.add(18);
		s.add(46);
		
		//using normal loop
		System.out.println("THE ELEMENTS OF ARRAY LIST USING NORMAL LOOP");
		for(int i =0; i<s.size() ;i++)
		{
			System.out.println(s.get(i));
		}
		
		//using enhanced for loop
		
		System.out.println("THE ELEMENTS OF ARRAY LIST USING ENHANCED  LOOP");
		
		for(Integer a : s)
		{
			System.out.println(a);
		
		}
		
		//using Iterator
				System.out.println("THE ELEMENTS OF ARRAY LIST USING ITERATOR");
				
				Iterator i = s.iterator();
				
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				
		
		
		//using while loop 
		System.out.println("THE ELEMENTS OF ARRAY LIST USING WHILE  LOOP");
		
		int n = 0;
		while(s.size()>n)
		{
			System.out.println(s.get(n));
			n++;
		}
		
		//sorting the Array
		Collections.sort(s);
		
		System.out.println("SORTED ARRAY ELEMENTS ARE "+s);
		
		
	}

}
