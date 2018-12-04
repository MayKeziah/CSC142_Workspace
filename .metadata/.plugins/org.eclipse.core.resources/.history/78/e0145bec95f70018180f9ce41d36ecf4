package people;

/********************************************************************
 * 		Employee Class: 												
 * 			This is a subclass of Person for Employees of a College.
 * 			A college employee has a name, age, office, and a salary.									
 ********************************************************************/
public class Employee extends Person {
	private String office;
	private double salary;
	
	/********************************************************************
	 * 		Constructors: 												
	 * 			overloaded constructors										
	 ********************************************************************/
	
	//Default
	public Employee() {}
	
	//Person and Employee data fields passed as parameters
	public Employee(String name, int age, String office, double salary) {
		this(new Person(name, age), office, salary);
	}
	
	//Person object and Employee data fields passed as parameters
	public Employee(Person person, String office, double salary) {
		super(person);
		this.office = office;
		this.salary = salary;
	}
	
	//Data fields passed as parameters
	public Employee(String office, double salary) {
		this(null, 0, office, salary);
	}
	
	//Person data fields passed only, no values for Employee fields
	public Employee(String name, int age) {
		this(name, age, null, 0.0);
	}
	
	/********************************************************************
	 * 		Accessor methods: getOffice() and getSalary()	 												
	 * 			data field getters														
	 ********************************************************************/
	//Accessors to get Data Field values
	public String getOffice() {
		return office;
	}
	public double getSalary() {
		return salary;
	}
	
	/********************************************************************
	 * 		payments Method: overloaded
	 * 			One takes no arguments and
	 * 			returns the biweekly payment installments (thisSalary / 24).								
	 * 			
	 * 			The other takes a salary as an argument and
	 * 			returns that salary's payment installments (passedSalary / 24).					
	 ********************************************************************/
	public double payments() {
		return this.payments(salary);
	}
	public double payments(double salary) {
		return super.hundredth(salary/24.0);
	}

	/********************************************************************
	 * 		printStatus Method: Overrides Person.printStatus()												
	 * 			Takes no arguments
	 * 			returns a string representation of an Employee's status, 
	 * 			"Employee".									
	 ********************************************************************/
	public String printStatus() {
		return "Employee";
	}
	
	/********************************************************************
	 * 		toFile Method:											
	 * 			Takes no arguments,
	 * 			returns a string representation of a person (their data fields
	 * 			and type) as needed to write to a file.						
	 ********************************************************************/
	public String toFile() {
		return super.toFile() + "," + office + "," + salary;
	}
	
	/********************************************************************
	 * 		toString Method: overrides Object.toString() 												
	 * 			returns a string representation of an Employee (its data fields).									
	 ********************************************************************/
	public String toString() {
		String officeLine	 	= "\n  Office: " + office;
		String salaryLine 		= "\n  Salary: " + salary;
		String installmentLine 	= "\nPayments: " + this.payments();
		return super.toString() + officeLine + salaryLine + installmentLine
								+ "\n--------------------------------------------------\n";
	}
	
	/********************************************************************
	 * 		Mutator Methods: setOffice() and setSalary()	 												
	 * 			Data field setters.														
	 ********************************************************************/
	//Mutators to set Data Field Values
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
