package java3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Yasin");
		student.setLastName("Sensoy");
		student.setToken(7);
		System.out.println("Student Name: " + "" + student.getFirstName() + " " + student.getLastName() + "," + "Number: " + "" + student.getToken());
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCreditcart(new DataBaseLogger());
		studentManager.addenrollCourse(new DataBaseLogger());
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCreditcart(new DataBaseLogger());
		instructorManager.addCourse(new DataBaseLogger());
		instructorManager.addreturnCourse(new DataBaseLogger());
		
		
	}

}
