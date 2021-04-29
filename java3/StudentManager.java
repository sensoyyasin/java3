package java3;

public class StudentManager extends UserManager {
	
	public void enrollCourse(Logger logger) {
		System.out.println("enrolled in the course");
		logger.log();
	}
}
