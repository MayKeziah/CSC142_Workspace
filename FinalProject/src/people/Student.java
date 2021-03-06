package people;

/********************************************************************
 * 		Student Class: 												
 * 			This is a subclass of Person for Students of a College.
 * 			A college student has a name, age, 
 * 			status (college year), and GPA.									
 ********************************************************************/
public class Student extends Person {
	private Status status;
	private double GPA;

	/********************************************************************
	 * 		Constructors: 												
	 * 			overloaded constructors									
	 ********************************************************************/
	//Default
	public Student() {}
	
	//Person object and Student data fields passed as parameters
	public Student(Person person, Status status, double GPA) {
		super(person);
		this.status = status;
		setGPA(GPA);
	}

	//data fields passed as parameters
	public Student(Status status, double GPA) {
		this(null, 0, status, GPA);
	}
	
	//Person data fields passed only, no values for Student fields
	public Student(String name, int age) {
		this(name, age, null, 0.0);
	}
	
	//Person and Student data fields passed as parameters
	public Student(String name, int age, Status status, double GPA) {
		this(new Person(name, age), status, GPA);
	}
	
	/********************************************************************
	 * 		isOnProbation Method:	 												
	 * 			Takes no arguments
	 * 			returns a boolean representation of whether the student is
	 * 			on probation or not. If the GPA is between 0 and 2.0, 
	 * 			it returns true. Over 2.0 it returns false.									
	 ********************************************************************/
	public boolean isOnProbation() {
		if (GPA >= 2.0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/********************************************************************
	 * 		Accessor Methods: getGPA() and getStatus()	 												
	 * 			Data field getters													
	 ********************************************************************/
	public double getGPA() {
		return GPA;
	}
	public Status getStatus() {
		return status;
	}
	
	/********************************************************************
	 * 		printStatus Method: Overrides Person.printStatus()												
	 * 			Takes no arguments
	 * 			returns a string representation of a student's status, 
	 * 			"Student".									
	 ********************************************************************/
	public String printStatus() {
		return "Student";
	}
	
	/********************************************************************
	 * 		toFile Method:											
	 * 			Takes no arguments,
	 * 			returns a string representation of a person (their data fields
	 * 			and type) as needed to write to a file.						
	 ********************************************************************/
	public String toFile() {
		return super.toFile() + "," + GPA + "," + status + "\n";
	}
	
	/********************************************************************
	 * 		toString Method: overrides Object.toString() 												
	 * 			returns a string representation of a Student (its data fields).									
	 ********************************************************************/
	public String toString() {
		String gpaLine = "\n     GPA: " + GPA;
		String statusLine = "\n  Status: " + status;
		return super.toString() + gpaLine + statusLine
								+ "\n--------------------------------------------------\n";
	}
	
	/********************************************************************
	 * 		Mutator Methods: setGPA() and setStatus()	 												
	 * 			Data field setters													
	 ********************************************************************/
	public void setGPA(double GPA) {
		if (GPA >= 0) {
			this.GPA = GPA;
		}
		else {
			System.out.println("Invalid GPA: " + GPA);
		}
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	

}

