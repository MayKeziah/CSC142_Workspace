package filing;

public class Student {
	
	private String firstName;
	private String lastName;
	private double score;
	
	/*****************************************************************
	 * Constructor: Student(String, Status, double)
	 *              This constructor passes a Person's name to its
	 *              superclass and initializes its own data fields.
	 * ***************************************************************/
	public Student(String firstName, String lastName, double score) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.score     = score;
	}
	
	/*****************************************************************
	 * accessor: getScore
	 *           gets the score of Student
	 * ***************************************************************/
	public double getScore() {
		return score;
	}
	
	/*****************************************************************
	 * override: toFile
	 *           prints data fields as a string to File
	 * ***************************************************************/
	public String toFile( ) {
		return firstName + "\t" + lastName + "\t" + score;
	}
	
	/*****************************************************************
	 * override: toString
	 *           prints data fields as a String
	 * ***************************************************************/
	public String toString( ) {
		return super.toString() + "Name:\t" + firstName + "\t" + lastName +
			                      "Score:\t" + score;
	}
}
