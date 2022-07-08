//Increasing arraylist size using ensurecapacity method
package executor;

import java.util.ArrayList;

public class MaximizingArray {

	public static void main(String[] args) {
		
ArrayList<String> a = new ArrayList<String>();
		
		//add elements to AArrayList
		a.add("Shin");
		a.add("Chan");
		a.add("Dora");
		a.add("Map");
		a.add("Bojji");
		System.out.println("The elements of the ArrayList : " );
		
		//iterating elements using advance for loop
		for(String b:a)
		{
			System.out.println(b);
		}
		
		System.out.println();
		
		//increasing the size by adding elements 
		a.ensureCapacity(6);
		a.add("Zeus");
		a.ensureCapacity(7);
		a.add("Taurus");
		
		
		
System.out.println("The elements of the ArrayList After adding element  : " );
		
		//iterating elements using advance for loop
		for(String b:a)
		{
			System.out.println(b);
		}
		
		
		//Remove All elements from the ArrayList
		a.removeAll(a);
		
System.out.println("The elements of the ArrayList After removing all element  : " );
		
		//iterating elements using advance for loop
		for(String b:a)
		{
			System.out.println(b);
		}
		

	}

}
