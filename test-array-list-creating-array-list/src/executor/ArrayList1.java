//
package executor;

import java.util.ArrayList;

import java.util.Collections;


public class ArrayList1 {

	public static void main(String[] args) {
		
		
		//creating an object for ArrayList
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(50);
		s.add(51);
		s.add(52);
		s.add(53);
		s.add(54);
		s.add(55);
		s.add(56);
		
		//creating an array list
		System.out.println("List of array elements : "+s);
		
		
		
		//adding elements ussing index
		//using enhanced loop for accesing elements
		s.add(2,54);
		
		
			System.out.println("List of array elements after adding an element with index: "+s);
		
		
		
		//sorting the array list using sort() method under collection class
		Collections.sort(s);
		System.out.println("List of array elements after sorting: "+s);
		
		//update the values in the array using set()
		s.set(2, 53);
		System.out.println("List of array elements after changing the element with index: "+s);
		
		
		
		//removing an element from the arraylist
		s.remove(5);
		System.out.println("List of array elements after removing an element : "+s);
		
		
		
		//printing the size of the arraylist
		System.out.println("Size of the Array Elments : "+s.size());
		
		//checking whether a particular data is found in array or not
		System.out.println("check the element 50 in list :"+s.contains(s));
		
		//to remove all elements we use clear
		s.clear();
		System.out.println(" the list is "+s);
		
		
		
	}

}
