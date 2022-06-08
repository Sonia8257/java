package entity;
import java.util.Scanner;
public class Studentbooks {
	private int Students;
	private int books;
	private int dist_books;
	
	
	
	
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
	public void setStudents(int students) {
		Students = students;
	}
	public int getBooks() {
		return books;
	}
	public void setBooks(int books) {
		this.books = books;
	}
	
	

	

}
