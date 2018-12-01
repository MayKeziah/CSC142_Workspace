package persons;
/********************************************************************
 * 		PERSON CLASS: A PERSON HAS A NAME AND AGE					*
 * 		WHICH CAN BE SET AND RETRIEVED.								*
 ********************************************************************/
public class Person {
	private String name; 	//DATA FIELD 1
	private int age;		//DATA FIELD 2
	
	/********************************************************************
	 * 		CONSTRUCTORS: 												*
	 * 		4 overloaded constructors									*
	 ********************************************************************/
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		this.name = name;
		this.age = 00;
	}
	public Person(int age) {
		this.name = "Unknown";
		this.age = age;
	}
	public Person() {
		this.name = "Unknown";
		this.age = 00;
	}

	
	/********************************************************************
	 * 		ACCESSORS:	 												*
	 * 		2 getters													*
	 ********************************************************************/
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	/********************************************************************
	 * 		MUTATORS:	 												*
	 * 		2 setters													*
	 ********************************************************************/
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
