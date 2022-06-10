package entity;

import java.util.Scanner;

public class Studentbooks {
	private int books;
	private int dist_books;
       
	System.out.println("ENTER NUMBER OF STUDENTS)");
		Scanner s = new Scanner(System.in);
		
	int	Students = s.nextInt();
	
	public int getDist_books() {
		
		dist_books = books/Students;
		return dist_books;
	}



	public Studentbooks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getStudents() {
		
		return Students;
	}
	
	public int getBooks() {
		return books;
	}
	public void setBooks(int books) {
		this.books = books;
	}
	
	

}
