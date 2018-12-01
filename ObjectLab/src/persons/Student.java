package persons;

/********************************************************************
 * 		PERSON CLASS: A PERSON HAS A PERSON AND GPA					*
 * 		WHICH CAN BE SET AND RETRIEVED.								*
 ********************************************************************/
public class Student {
	private Person person;
	private double GPA;
	
	/********************************************************************
	 * 		CONSTRUCTORS: 												*
	 * 		4 overloaded constructors									*
	 ********************************************************************/
	public Student(Person person, double GPA) {
		this.person = person;
		this.GPA = GPA;
	}
	public Student(Person person) {
		this.person = person;
		this.GPA = 0.0;
	}
	public Student(double GPA) {
		this.person = new Person();
		this.GPA = GPA;
	}
	public Student() {
		this.person = new Person();
		this.GPA = 0.0;
	}
	
	/********************************************************************
	 * 		ACCESSORS:	 												*
	 * 		2 getters													*
	 ********************************************************************/
	public Person getPerson() {
		return person;
	}
	public double getGPA() {
		return GPA;
	}
	
	/********************************************************************
	 * 		MUTATORS:	 												*
	 * 		2 setters													*
	 ********************************************************************/
	public void setPerson(Person person) {
		this.person = person;
	}
	public void setGPA(int GPA) {
		this.GPA = GPA;
	}
	

}
