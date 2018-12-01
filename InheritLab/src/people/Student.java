package people;

public class Student extends Person {
	private Status status;
	private double GPA;

	/********************************************************************
	 * 		CONSTRUCTORS: 												
	 * 			4 overloaded constructors									
	 ********************************************************************/
	public Student() {
		this.GPA = 00;
		this.status = Status.FRESHMAN;
	}
	public Student(Status status, double GPA) {
		this(null, 0, status, GPA);
	}
	public Student(String name, int age) {
		this(name, age, null, 0.0);
	}
	public Student(String name, int age, Status status, double GPA) {
		super(name, age);
		this.GPA = GPA;
		this.status = status;
	}

	/********************************************************************
	 * 		ACCESSORS:	 												
	 * 			2 getters													
	 ********************************************************************/
	public boolean isOnProbation() {
		if (GPA >= 2.0) {
			return false;
		}
		else if (GPA >= 0) {
			return true;
		}
		else {
			throw new IllegalArgumentException("Invalid GPA, please correct GPA value and try again");
		}
	}
	
	public double getGPA() {
		return GPA;
	}
	public Status getStatus() {
		return status;
	}
	
	public String printStatus() {
		return "Student";
	}
	public String toString() {
		String gpaLine = "\n     GPA: " + GPA;
		String statusLine = "\n  Status: " + status;
		return super.toString() + gpaLine + statusLine;
	}
	
	/********************************************************************
	 * 		MUTATORS:	 												
	 * 			2 setters													
	 ********************************************************************/
	public void setGPA(int GPA) {
		this.GPA = GPA;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	

}

