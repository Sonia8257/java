package entity;

public class Student4
{
	private int id;
	private String name;
	public Student4 () {
		super();
		// TODO Auto-generated constructor stub
}
	public Student4(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	

}
