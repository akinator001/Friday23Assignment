import java.util.*;

public class CourseHandler {
	
	String name;
	int id ;
	int duration;
	ArrayList<Course> listOfCourses = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	CourseHandler(){
		System.out.println("press 1 to show the courses");
		System.out.println("press 2 to enter new course");
		System.out.println("press 3 to enroll into course");
		System.out.println("press 4 to exit");
		int inputFromUser = sc.nextInt();
		switch(inputFromUser) {
		case 1:
			displayAllCourse();
			break;
		case 2:
			addNewCourse();
			break;
		case 3:
			enrollIntoCourse();
			return;
		case 4:
			return;
		default:
			System.out.println("Please enter proper input");
		}
		
	}
	
	

	public void addNewCourse() {
		System.out.println("Please enter the course details");
		System.out.println("Please enter the course name");
		name = sc.next();
		System.out.println("Please enter the course id");
		id = sc.nextInt();
		System.out.println("Please enter the course duration");
		duration = sc.nextInt();
		
		Course course = new Course(name, id , duration);
		listOfCourses.add(course);
	}
	
	public void displayAllCourse() {
		for(Course course : listOfCourses) {
			System.out.println("name " + course.getName() + "id " + course.getCourseId() + "duration " + course.getDuration());
		}
	}
	
}
