
public class Student {
	
	String name;
	String collegeName;
	int rollNumber;
	
	Student(String name, String collegeName,int rollNumber){
		this.name = name;
		this.collegeName = collegeName;
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

}	
