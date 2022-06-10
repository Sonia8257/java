package executor;

import java.util.Scanner;

import entity.Studentbooks;

public class Distributingbooks {

	public static void main(String[] args) {
		
		
	
		Studentbooks st = new Studentbooks();
		st.setBooks(100);
		
		System.out.println("Total nummber of students : "+st.getStudents());
		System.out.println("Total nummber of books : "+st.getBooks());
		System.out.println("each students should get atleast "+st.getDist_books());
		

	}

}
