package java3;

public class Student extends User {
	
	private int studentToken;
	
	public Student() {
		
	}
	
	public Student(int studentToken) {
		
		super();
		this.studentToken = studentToken;
		
	}
	public int getStudentToken() {
		return studentToken;
	}
	public void setstudentToken(int studentToken) {
		this.studentToken = studentToken;
	}
}
