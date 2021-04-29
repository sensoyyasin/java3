package java3;

public class Instructor extends User {
	
private int instructorToken;

public Instructor() {

}

public Instructor(int instructorToken) {
	super();
	this.instructorToken = instructorToken;
}
public int getInstructorToken() {
	return instructorToken;
}

public void setInstructorToken(int instructorToken) {
	this.instructorToken = instructorToken;

}
}
