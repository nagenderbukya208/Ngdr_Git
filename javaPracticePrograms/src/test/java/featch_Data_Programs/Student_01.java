package featch_Data_Programs;

public class Student_01 {
	String name;
	char grade;
	int rollNo;
	public Student_01(String name, char grade, int rollNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String toString()
	{
		return "name : "+name+"grade : "+grade+"rollNo :"+rollNo;
	}
}

