
public class Course {
	String name;
	int courseId;
	int duration;
	
	Course(String name, int courseId, int duration){
		this.name = name;
		this.courseId = courseId;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
