import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TO Enter Course Details press 1");
		System.out.println("TO Enter Student Details press 2");
		System.out.println("TO Enroll into Course press 3");
		System.out.println("TO Exit press 4");
		
		int inputFromUser = sc.nextInt();
		
		switch(inputFromUser) {
		case 1:
			CourseHandler courseHandler = new CourseHandler();
			break;
		case 2:
			StudentHandler studentHandler = new StudentHandler();
			break;
		case 3:
			break;
		case 4:
			
		default:
			System.out.println("Please enter proper input");
		}
		
	}
}
