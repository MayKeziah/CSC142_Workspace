package people;
/********************************************************************
 * 		Person Class: 												
 * 			This class is a super class for persons associated with
 * 			a college. A college person has a name and an age.								
 ********************************************************************/
public class Person {
	private int age;
	private String name;
	
	/********************************************************************
	 * 		Constructors: 												
	 * 			overloaded constructors 									
	 ********************************************************************/
	//Default
	public Person() {}
	
	//data fields passed as parameters
	public Person(String name, int age) {
		this.age  = age;
		this.name = name;
	}
	
	//Copy constructor: copies data fields of passed Person
	public Person(Person person) {
		this.age = person.age;
		this.name = person.name;
	}

	
	/********************************************************************
	 * 		Accessor Methods: getAge() and getName() 												
	 * 			Data field getters														
	 ********************************************************************/
	//Accessors to get Data Field Values
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	/********************************************************************
	 * hundredth Method:
	 * 		takes a double and returns that double rounded at two decimal
	 * 		places (the hundredth place).
	 ********************************************************************/
	public double hundredth(double number) {
		return Math.round(number * 100)/100.0;
		
	}
	/********************************************************************
	 * 		printStatus Method: 												
	 * 			Takes no arguments,
	 * 			returns a string representing the person's status
	 *			"College Person".								
	 ********************************************************************/
	public String printStatus() {
		return "College Person";
	}

	/********************************************************************
	 * 		toFile Method:											
	 * 			Takes no arguments,
	 * 			returns a string representation of a person (their data fields
	 * 			and type) as needed to write to a file.						
	 ********************************************************************/
	public String toFile() {
		return this.printStatus() + "," + name + "," + age;
	}
	
	/********************************************************************
	 * 		toString Method: Overrides Object.toString()												
	 * 			Takes no arguments,
	 * 			returns a string representation of a person (their data fields).						
	 ********************************************************************/
	public String toString() {
		String nameLine = "    Name: " + name;
		String ageLine  = "\n     Age: " + age;
		return "\n--------------------------------------------------\n" + nameLine + ageLine;
	}
	
	/********************************************************************
	 * 		MUTATORS: setAge() and setName()												
	 * 			Data field setters.											
	 ********************************************************************/
	//Mutators to set Data Field values
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

}
