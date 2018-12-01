package people;

public class Employee extends Person {
	private String office;
	private double salary;
	
	/********************************************************************
	 * 		CONSTRUCTORS: 												
	 * 			overloaded constructors										
	 ********************************************************************/
	
	public Employee () {}
	public Employee (String name, int age, String office, double salary) {
		super(name, age);
		this.office = office;
		this.salary = salary;
	}
	public Employee(String office, double salary) {
		this(null, 0, office, salary);
	}
	public Employee(String name, int age) {
		this(name, age, null, 0.0);
	}
	
	/********************************************************************
	 * 		ACCESSORS:	 												
	 * 			getters														
	 ********************************************************************/
	//Accessors to get Data Field values
	public String getOffice() {
		return office;
	}
	public double getSalary() {
		return salary;
	}
	//Accessors to get biweekly payment amounts
	public double payments() {
		return this.payments(salary);
	}
	public double payments(double salary) {
		return salary;
	}
	//Accessors to print information 
	public String printStatus() {
		return "Employee";
	}
	public String toString() {
		String officeLine	 	= "\n  Office: " + office;
		String salaryLine 		= "\n  Salary: " + salary;
		String installmentLine 	= "\nPayments: " + this.payments();
		return super.toString() + officeLine + salaryLine + installmentLine;
	}
	
	/********************************************************************
	 * 		MUTATORS:	 												
	 * 			setters														
	 ********************************************************************/
	//Mutators to set Data Field Values
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
