package people;

public class Person {
	private int age;		//DATA FIELD 1
	private String name; 	//DATA FIELD 2
	
	/********************************************************************
	 * 		CONSTRUCTORS: 												
	 * 			overloaded constructors										
	 ********************************************************************/
	
	public Person(String name, int age) {
		this.age  = age;
		this.name = name;
	}
	public Person() {}

	
	/********************************************************************
	 * 		ACCESSORS:	 												
	 * 			getters														
	 ********************************************************************/
	//Accessors to get Data Field Values
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	//Accessors to print information
	public String printStatus() {
		return "College Person";
	}
	public String toString() {
		String nameLine = "    Name: " + name;
		String ageLine  = "\n     Age: " + age;
		return nameLine + ageLine;
	}
	
	/********************************************************************
	 * 		MUTATORS:	 												
	 * 			setters														
	 ********************************************************************/
	//Mutators to set Data Field values
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

}
