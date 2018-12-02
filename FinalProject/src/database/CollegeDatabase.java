package database;

import java.util.Arrays;

import people.Employee;
import people.Person;
import people.Student;

/******************************************************************************
 * 		CollegeDatabase Class: 												
 * 			This class will maintain a database of people that are members 
 * 			of a college. This class is implemented using an array and 
 * 			Imports Person class.								
 ******************************************************************************/
public class CollegeDatabase implements Database{
	//An array that holds Person objects. New entries are added to the next available position
	private Person[] entry; 
	
	//This keeps track of the number of elements in the array and the position to add the next database entry
	private int size;
	
	//Has a value of 20 as the starting database size
	final static int DEFAULT_SIZE = 20;
	
	//Has a value of -1 for any entry not found
	final int NOT_FOUND = -1;
	
	//FIXME
	public static enum PersonType{
		EMPLOYEE, STUDENT
	}
	
	//FIXME
	public static enum Operator{
		OVER, UNDER
	}
	
	/**************************************************************************
	 * 		Constructor: 
	 * 			a no-argument constructor that calls a second constructor 
	 * 			with DEFAULT_SIZE as its argument.								
	 **************************************************************************/
	public CollegeDatabase() {
		this(DEFAULT_SIZE);
	}
	
	/**************************************************************************
	 * 		Constructor: 
	 * 			Takes arrays maximum size as an integer and initializes 
	 * 			the count (size) to zero. The array of PErson objects 
	 * 			is initialized here.									
	 **************************************************************************/
	public CollegeDatabase(int capacity) {
		size = 0;
		if (capacity >= 0) {
			entry = new Person[capacity];
		}
		else {
			throw new IllegalArgumentException("List size cannot be negative.");
		}
	}
	
	/**************************************************************************
	 * 		Constructor: 
	 * 			Takes an array of Person type and an integer representing the
	 * 			size, or number of elements, that are currently stored in the
	 * 			array. This array becomes the entry data field and the size 
	 * 			becomes the size data field. 	
	 **************************************************************************/
	public CollegeDatabase(Person[] typeDatabase, int count) {
		entry = typeDatabase;
		size = count;
	}
	
	
	/**************************************************************************
	 * 		add Method: adds a new Person object to the database.
	 * 			Takes one parameter, a Person object, and adds it to the 
	 * 			existing database. Does not allow duplicate names. 
	 * 			when Database is too full, add expands it to accommodate 
	 * 			new entries.									
	 **************************************************************************/
	public void add (Person person) { //FIXME
		if (this.findLocation(person.getName()) == -1){
			if(size == entry.length) {
				expand();
			}
			entry[size] = person;
			size++;
		}
		else {
			System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
					+ "Add method failed to execute, name already exists. "
					+ "\nThe following person was NOT added to the database:\n" + person.toString() 
					+ "END ADD METHOD FAILED MESSEGE"
					+ "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
		}
	}
	
	/**************************************************************************
	 * 		delete Method: deletes a specific Person from the database.
	 * 			Takes one parameter, an integer representing the location 
	 * 			in the database of the entry to delete and the following 
	 * 			entries are shifted to fill the deleted location.	
	 **************************************************************************/
	public boolean delete(int index) {
		if ((index < 0) || (index >= size)) {
			return false;
		}
		else {
			entry[index] = null;
			for (int i = index; i < size; i++) {
				entry[i] = entry[i + 1];
			}
			size--;
			return true;
		}
	}
	/**************************************************************************
	 * 		delete Method: deletes a specific Person from the database.
	 * 			Takes one parameter, a Person object. It uses the name to
	 * 			find the location in the database of the entry to delete
	 * 			and the following entries are shifted to fill the deleted
	 * 			location.	
	 **************************************************************************/
	public boolean delete(String name) {
		int index = this.findLocation(name);
		return this.delete(index);
	}
	
	/**************************************************************************
	 * 		expand Method: expands database size to add more entries when full. 
	 * 			Takes no parameters.
	 * 			This helper method creates a new array that is twice the 
	 * 			size of the current array and copies the entries from the 
	 * 			original array into the new array. The new array will now be 
	 * 			used going forward.						
	 **************************************************************************/
	public void expand() {
		Person[] newArray = new Person[2 * entry.length];
		for(int i = 0; i < entry.length; i++) {
			newArray[i] = entry[i];
		}
		entry = newArray;
	}
	
	/**************************************************************************
	 * 		findLocation Method: Find the location of a name/age/salary/subtype in the database. 
	 * 			Takes one parameter, a string/int/double/subtype of the person's name/age/salary/subtype.
	 * 			Finds and returns the index at which that person is located 
	 * 			in the database.	
	 * 			If the name/age/salary/subtype is not found, it returns the value NOT_FOUND (-1).			
	 **************************************************************************/
	public int findLocation(String name) {
		for (int i = 0; i < size; i++) {
			if (entry[i].getName().equals(name)) {
				return i;
			}
		}
		return NOT_FOUND;
	}
	
	/**************************************************************************
	 * 		get Method: Gets information about a person.
	 * 			Takes one parameter, an integer index of the database.
	 * 			Returns the person object at that location.		
	 **************************************************************************/
	public Person get(int index) {
		return entry[index];
	}

	/**************************************************************************
	 * 		getDatabase Method:  
	 * 			Takes no parameters.
	 * 			Returns the full database.		
	 **************************************************************************/
	public Person[] getDatabase() {
		return entry;
	}

	/**************************************************************************
	 * 		getSize Method: Data field getter
	 * 			Takes no parameters.
	 * 			returns the current number of Person objects in the Database.
	 **************************************************************************/
	public int getSize() {
		return size;
	}
	
	/******************************************************************FIXME*/
	public void print() {
		System.out.println(this.toString());
	}

	/**************************************************************************
	 * 		search Method: Searches for a specific Person in the database.
	 * 			Takes one parameter, a String of a Person's name.
	 * 			If found, it returns the Person's information. 
	 * 			If not found, it returns a "Person not in Database" statement.
	 **************************************************************************/
	public Person search(String name) {
		int personPosition = this.findLocation(name);
		return entry[personPosition];
	}

	/**************************************************************************
	 * 		separate Method: creates a new database of Person objects with a specified age.
	 * 			Takes one parameter, a Person's age. 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new array full of Person objects that have the specified age.
	 * 			Returns a College Database of people this age.
	 **************************************************************************/
	public CollegeDatabase separate(int age) {
		Person[] ofAge = new Person[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (entry[i].getAge() == age) {
				ofAge[count] = entry[i];
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No entries match your search range.");
			return new CollegeDatabase();
		}
		return new CollegeDatabase(ofAge, count);
	}
	
	/**************************************************************************
	 * 		separate Method: creates a new database of Person objects with a specified age.
	 * 			Takes 3 parameters, a Person's sub-type, a double (salary or GPA), 
	 * 			and an operator ("over" or "under"). 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new CollegeDatabase full of Person objects that have 
	 * 			data fields in the specified range.
	 * 			Returns the new college database.
	 **************************************************************************/
	
	public CollegeDatabase byGPA(double GPA, Operator operator) {
		Person[] inRange = new Person[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (operator == Operator.OVER){
				if (((Student)entry[i]).getGPA() > GPA) {
					inRange[count] = entry[i];
					count++;
				}
			}
			else if (operator == Operator.UNDER) {
				if (((Student)entry[i]).getGPA() < GPA) {
					inRange[count] = entry[i];
					count++;
				}
			}
		}
		return new CollegeDatabase(inRange, count);
	}
	
	public CollegeDatabase bySalary(double salary, Operator operator) {
		Person[] inRange = new Person[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (operator == Operator.OVER){
				if (((Employee)entry[i]).getSalary() > salary) {
					inRange[count] = entry[i];
					count++;
				}
			}
			else if (operator == Operator.UNDER) {
				if (((Employee)entry[i]).getSalary() < salary) {
					inRange[count] = entry[i];
					count++;
				}
			}
		}
		return new CollegeDatabase(inRange, count);
	}
	
	/*************************************************************************FIXME
	 * Create new database OR delete not add*/
	public CollegeDatabase separate(PersonType type, double num, Operator operator) throws IllegalArgumentException {
		CollegeDatabase ofType = this.separate(type);
		CollegeDatabase inRange;
		if (type == PersonType.EMPLOYEE) {
			inRange = ofType.bySalary(num, operator);
		}
		else if (type == PersonType.STUDENT) {
			inRange = ofType.byGPA(num, operator);
		}
		else {
			throw new IllegalArgumentException("Type must be \"Employee\" or \"Student\". Type given: " + type + ".");
		}
		return inRange;
	
	}
	
	/**************************************************************************
	 * 		separate Method: creates a new database of Person objects with a specified age range.
	 * 			Takes two parameters, a Person's age, and and an Operator (CollegeDatabase.Operator) "OVER" or "UNDER".
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new array full of Person objects that are over/under the specified range.
	 * 			Returns a College Database of people of this age range.
	 **************************************************************************/
	public CollegeDatabase separate(int age, Operator operator) throws IllegalArgumentException{ //when .print() used, null to string error FIXME
		Person[] inRange = new Person[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (operator == Operator.OVER){
				if (entry[i].getAge() > age) {
					inRange[count] = entry[i];
					count++;
				}
			}
			else if (operator == Operator.UNDER) {
				if (entry[i].getAge() < age) {
					inRange[count] = entry[i];
					count++;
				}
			}
			else {
				throw new IllegalArgumentException("Invalid operator: \"" + operator + "\". Operator must be \"over\" or \"under\".");
			}
		}
		return new CollegeDatabase(inRange, count);
	}
	
	/**************************************************************************
	 * 		separate Method: creates a new database of a specified sub-type.
	 * 			Takes one parameter, a string of a sub-type ("Employee" or "Student"). 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new array full of Person objects that are instances 
	 * 			of either "Employee" or "Student", as specified by the parameter.
	 * 			It then returns a CollegeDatabase of the array of sub-type objects.
	 **************************************************************************/
	public CollegeDatabase separate(PersonType type) throws IllegalArgumentException{
		Person[] typeData = new Person[size];
		int count = 0;
		if (type == PersonType.EMPLOYEE) {
			for (int i = 0; i < this.size; i++) {
				if (entry[i] instanceof Employee) {
					typeData[count] = entry[i]; 
					count++;
				}
			}
		}
		else if (type == PersonType.STUDENT) {
			for (int i = 0; i < this.size; i++) {
				if (entry[i] instanceof Student) {
					typeData[count] = entry[i]; 
					count++;
				}
			}
		}
		else {
			throw new IllegalArgumentException("Invalid entry \"" + type + "\". Database type "
												+ "must be PersonType.STUDENT or PersonType.EMPLOYEE, please try again");
		}
		return new CollegeDatabase(typeData, count);
	}
	
	/******************************************************************FIXME*/
	public String toString() throws NullPointerException{
		String databaseString = "";
		try{
			for (int i = 0; i < size; i++) {
				databaseString += entry[i].toString();
			}
		}
		catch (NullPointerException exception) {
			System.out.println("size: " + this.size + databaseString); //delete test FIXME
			System.out.println("Cannot resolve null to a string.");
		}
		return databaseString;
	}
}
