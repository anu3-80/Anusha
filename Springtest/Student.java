package Spring_test;

public class Student 
{
	String name;
	String sectioon;
	int marks;
	String clg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSectioon() {
		return sectioon;
	}
	public void setSectioon(String sectioon) {
		this.sectioon = sectioon;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sectioon=" + sectioon + ", marks=" + marks + ", clg=" + clg + "]";
	}
}
