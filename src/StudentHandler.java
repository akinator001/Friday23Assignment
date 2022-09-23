import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandler {
	String name;
	String collegeName;
	int rollNumber;
	ArrayList<Student> listOfStudent = new ArrayList<>();
	
	
	Scanner sc = new Scanner(System.in); 
	
	StudentHandler(){
		System.out.println("press 1 to show the student");
		System.out.println("press 2 to enter new student");
		System.out.println("press 3 to exit");
		int inputFromUser = sc.nextInt();
		switch(inputFromUser) {
		case 1:
			displayAllStudent();
			break;
		case 2:
			addNewstudent();
			break;
		case 3:
			return;
		default:
			System.out.println("Please enter proper input");
		}	
	}
	
	
	
	public void addNewstudent() {
		System.out.println("Please enter the studnet details");
		System.out.println("Please enter the studnet name");
		name = sc.next();
		System.out.println("Please enter the studnet collegeName");
		collegeName = sc.next();
		System.out.println("Please enter the studnet rollNumber");
		rollNumber = sc.nextInt();
		
		Student student = new Student(name, collegeName , rollNumber);
		listOfStudent.add(student);
	}
	
	public void displayAllStudent() {
		for(Student student : listOfStudent) {
			System.out.println("name " + student.getName() + "college " + student.getCollegeName() + "rollnumber " + student.getRollNumber());
		}
	}
}
