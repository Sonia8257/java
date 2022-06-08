package entity;

public class Studentmarks {
	private String stud_name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total_marks;

	public Studentmarks(String stud_name, int sub1, int sub2, int sub3, int total_marks) {
		super();
		this.stud_name = stud_name;
		
	}

	public Studentmarks(int sub1, int sub2, int sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
public int total()
{
	int total = sub1+sub2+sub3;
	return total;
}
	

	public Studentmarks(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getTotal_marks() {
		this.total_marks = sub1+sub2+sub3;
		return total_marks;
		
	}

	

}
