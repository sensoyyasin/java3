package java3;

public class InstructorManager extends UserManager {
	
	public void addCourse(Logger logger) {
		System.out.println("Course is added");
		logger.log();
	}
	public void changeCourse(Logger logger) {
		System.out.println("Course is changed");
	}
	public void addreturnCourse(Logger logger) {
		System.out.println("Return to do course");
	}
}
