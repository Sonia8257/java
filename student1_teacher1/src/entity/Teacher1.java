package entity;

public class Teacher1 
{
	private String tname;
	private String subname;
	public Teacher1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher1(String tname, String subname) {
		super();
		this.tname = tname;
		this.subname = subname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "Teacher1 [tname=" + tname + ", subname=" + subname + "]";
	}
}
