package executor;

import entity.Studentbooks;

public class Distributingbooks {

	public static void main(String[] args) {
		
		Studentbooks s = new Studentbooks();
		s.setStudents(20);
		s.setBooks(100);
		
		System.out.println("Total nummber of students : "+s.getStudents());
		System.out.println("Total nummber of books : "+s.getBooks());
		System.out.println("each students should get atleast "+s.getDist_books());
		

	}

}
