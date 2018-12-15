package database;

import java.util.Scanner;

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
	private final static int DEFAULT_SIZE = 20;
	
	//Has a value of -1 for any entry not found
	private final int NOT_FOUND = -1;
	
	//To handle input errors
	private Scanner keyboard = new Scanner(System.in);
	
	//Person representing a Person not found in the Database.
	private final static Person PERSON_NOT_FOUND = new Person("NOT_FOUND", 0);
	
	
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
	 * 			the count (size) to zero. The array of Person objects 
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
	 * 		add Method: adds a new Person object to the database.
	 * 			Takes one parameter, a Person object, and adds it to the 
	 * 			existing database. Does not allow duplicate names. 
	 * 			when Database is too full, add expands it to accommodate 
	 * 			new entries.									
	 **************************************************************************/
	public void add (Person person) {
		if (person.getName().equals("NOT_FOUND")) {}
		else if (this.findLocation(person.getName()) == -1){
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
	 * 		add Method: adds information from another database to this database.
	 * 			Takes one parameter, a CollegeDatabase, and adds the content of 
	 * 			its array to this database. Does not allow duplicate names. 
	 * 			when Database is too full, add expands it to accommodate 
	 * 			new entries.									
	 **************************************************************************/
	public void add(CollegeDatabase data) {
		for (int i = 0; i < data.size; i++){
			if (data.entry[i] instanceof Person) {
				this.add(data.entry[i]);
			}
		}
	}
	
	/**************************************************************************
	 * 		byGPA Method: creates a new CollegeDatabase of Student objects, 
	 * 					  whose GPA is in a specified range.
	 * 			**This method is private**
	 * 			Takes 2 parameters, a double representing a Student's GPA,  
	 * 			and an operator ("over" or "under"). 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new CollegeDatabase full of Person objects that have 
	 * 			a GPA in the specified range.
	 * 			Returns the new college database.
	 **************************************************************************/
	
	private void byGPA(double GPA, Operator operator) {
		int i = 0;
		while (i < size) {
			if (operator == Operator.OVER){
				if (((Student)entry[i]).getGPA() <= GPA) {
					delete(i);
				}
				else {
					i++;
				}
			}
			else if (operator == Operator.UNDER) {
				if (((Student)entry[i]).getGPA() >= GPA) {
					delete(i);
				}
				else {
					i++;
				}
			}
		}
	}

	/**************************************************************************
	 * 		bySalary Method: creates a new database of Person objects, that are
	 * 						 instances of Employee's, with a salary in a 
	 * 						 specified range.
	 * 			Takes 2 parameters, a double representing an Employee's salary,  
	 * 			and an operator ("over" or "under"). 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new CollegeDatabase full of Person objects that have 
	 * 			a salary in the specified range.
	 * 			Returns the new college database.
	 **************************************************************************/
	private void bySalary(double salary, Operator operator) {
		int i = 0;
		while (i < size) {
			if (operator == Operator.OVER){
				if (((Employee)entry[i]).getSalary() <= salary) {
					delete(i);
				}
				else {
					i++;
				}
			}
			else if (operator == Operator.UNDER) {
				if (((Employee)entry[i]).getSalary() >= salary) {
					delete(i);
				}
				else {
					i++;
				}
			}
		}
	}

	/**************************************************************************
	 * 		delete Method: deletes a specific Person from the database.
	 * 			Takes one parameter, an integer representing the location 
	 * 			in the database of the entry to delete and the following 
	 * 			entries are shifted to fill the deleted location.
	 * 			Returns a boolean object representing whether the delete 
	 * 			was successful	
	 **************************************************************************/
	private boolean delete(int index) {
		if ((index < 0) || (index >= size)) {
			return false;
		}
		else {
			for (int i = index; i < (size - 1); i++) {
				entry[i] = entry[i + 1];
			}
			size--;
			return true;
		}
	}
	
	/**************************************************************************
	 * 		delete Method: deletes a specific Person from the database.
	 * 			Takes one parameter, a String object representing a Person's name. 
	 * 			It uses the name to find the location in the database of the entry 
	 * 			to delete and the following entries are shifted to fill the deleted
	 * 			location.	
	 * 			Returns a boolean object representing whether the delete 
	 * 			was successful
	 **************************************************************************/
	public boolean delete(String name) {
		int index = this.findLocation(name);
		if(index == -1) {
			System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" 
							 + "Person not found in database, could not delete " + name + "."
							 + "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
							 + "\nPlease try again.\t\t(Enter 'q' to quit)");
			System.out.println("Name of person to delete: ");
			String newName = keyboard.nextLine();
			if (!newName.equals("q")) {
				return this.delete(newName);
			}
		}
		return this.delete(index);
	}
	
	/**************************************************************************
	 * 		deleteDatabase Method: deletes a specific section from the database.
	 * 			Takes one parameter, a CollegeDatabase object. 
	 * 			it deletes each entry from the passed database from this database
	 * 			and the following entries are shifted to fill the deleted
	 * 			location.	
	 **************************************************************************/
	public void deleteDatabase(CollegeDatabase separatedData) {//FIXME: popDatabase?
		int successCount = 0;
		for (int i = 0; i < separatedData.size; i++) {
			boolean currentBool = this.delete(this.findLocation(separatedData.entry[i].getName()));
			if (currentBool) {
				successCount++;
			}
		}
		System.out.println("\nSuccessful deletions: " +  successCount
						 + "\n    Failed deletions: " + (separatedData.size - successCount) 
						 + "\n Attempted deletions: " +  separatedData.size);
	}

	/**************************************************************************
	 * 		expand Method: expands database size to add more entries when full. 
	 * 			Takes no parameters.
	 * 			This helper method creates a new array that is twice the 
	 * 			size of the current array and copies the entries from the 
	 * 			original array into the new array. The new array will now be 
	 * 			used going forward.						
	 **************************************************************************/
	private void expand() {
		Person[] newArray = new Person[2 * entry.length];
		for(int i = 0; i < entry.length; i++) {
			newArray[i] = entry[i];
		}
		entry = newArray;
	}
	
	/**************************************************************************
	 * 		findLocation Method: Find the location of a name in the database. 
	 * 			Takes one parameter, a string of the person's name.
	 * 			Finds and returns the index at which that person is located 
	 * 			in the database.	
	 * 			If the name is not found, it returns the value NOT_FOUND (-1).			
	 **************************************************************************/
	private int findLocation(String name) {
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
	 * 			If no Person object is found, returns PERSON_NOT_FOUND.		
	 **************************************************************************/
	public Person get(int index) {
		if ((index < 0) || (index >= size)) {
			System.out.println(index + " is not a valid index.");
			return PERSON_NOT_FOUND;
		}
		else{
			return entry[index];
		}
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
	
	/**************************************************************************
	 * 		pop Method: Gets information about a person while deleting them 
	 *					from this database.
	 * 			Takes one parameter, a String name of the Person Object.
	 * 			Returns the person object with that name and deletes them from 
	 * 			this database.		
	 **************************************************************************/
	public Person pop(int index) {
		if ((index < 0) || (index >= size)) {
			Person toReturn = get(index);
			delete(index);
			return toReturn;
		}
		return get(index);
	}
	
	
	/**************************************************************************
	 * 		print Method: Prints information about all Person objects in 
	 * 					  database to console.
	 * 			Takes no parameters.
	 * 			Prints information about every Person in the database.
	 **************************************************************************/
	public void print() {
		System.out.println(this.toString());
	}
	
	/**************************************************************************
	 * 		printCommaSeparated Method: Prints information about all Person 
	 * 									objects in database to console.
	 * 			Takes no parameters.
	 * 			Prints information about every Person in the database comma 
	 * 			separated by accessing toFile method for each index.
	 **************************************************************************/
	public void printCommaSeparated() {
		System.out.println(this.toFile());
	}

	/**************************************************************************
	 * 		search Method: Searches for a specific Person in the database.
	 * 			Takes one parameter, a String of a Person's name.
	 * 			If found, it returns the Person's information. 
	 * 			If not found, it returns a "Person not in Database" statement
	 * 			and an empty Peson object.
	 **************************************************************************/
	public Person search(String name) throws IllegalArgumentException{
		int personPosition = this.findLocation(name);
		if (personPosition == -1) {
			System.out.println("\"" + name + "\" was not found in the database.");
			return PERSON_NOT_FOUND;
		}
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
		CollegeDatabase ofAge = new CollegeDatabase(size);
		for (int i = 0; i < size; i++) {
			if (entry[i].getAge() == age) {
				ofAge.add(entry[i]);
			}
		}
		return ofAge;
	}
	
	/**************************************************************************
	 * 		separate Method: creates a new database of Person objects with a 
	 * 						 specified age range.
	 * 			Takes two parameters, a Person's age, and and an Operator 
	 * 			(CollegeDatabase.Operator) "OVER" or "UNDER". It then sorts 
	 * 			through the current array of Person type, entry, and makes a 
	 * 			new array full of Person objects that are over/under the 
	 * 			specified range.
	 * 			Returns a College Database of Person objects in this age range.
	 **************************************************************************/
	public CollegeDatabase separate(int age, Operator operator){
		CollegeDatabase inRange = new CollegeDatabase(size);
		for (int i = 0; i < size; i++) {
			if (operator == Operator.OVER){
				if (entry[i].getAge() > age) {
					inRange.add(entry[i]);
				}
			}
			else if (operator == Operator.UNDER) {
				if (entry[i].getAge() < age) {
					inRange.add(entry[i]);
				}
			}
		}
		return inRange;
	}

	/**************************************************************************
	 * 		separate Method: creates a new database of a specified sub-type.
	 * 			Takes one parameter, a PersonType (CollegeDatabase.PersonType)
	 * 			"EMPLOYEE" or "STUDENT". 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new array full of Person objects that are instances 
	 * 			of either "Employee" or "Student", as specified by the parameter.
	 * 			It then returns a CollegeDatabase of the array of sub-type objects.
	 **************************************************************************/
	public CollegeDatabase separate(PersonType type) throws IllegalArgumentException{
		CollegeDatabase typeData = new CollegeDatabase(size);
		if (type == PersonType.EMPLOYEE) {
			for (int i = 0; i < this.size; i++) {
				if (entry[i] instanceof Employee) {
					typeData.add(entry[i]); 
				}
			}
		}
		else if (type == PersonType.STUDENT) {
			for (int i = 0; i < this.size; i++) {
				if (entry[i] instanceof Student) {
					typeData.add(entry[i]); 
				}
			}
		}
		return typeData;
	}

	/**************************************************************************
	 * 		separate Method: creates a new database of Person objects with a 
	 * 						 GPA or Salary (depending on specified sub-type) 
	 * 						 in a specified range.
	 * 			Takes 3 parameters, a Person's sub-type, a double (representing 
	 * 			either a GPA or Salary), and an Operator (CollegeDatabase.Operator)
	 * 			"OVER" or "UNDER" representing the range direction in relation 
	 * 			to the double. 
	 * 			It then sorts through the current array of Person type, entry, 
	 * 			and makes a new array full of Person objects that have the 
	 * 			data field "GPA" or "salary" in the specified range.
	 * 			Returns a College Database of people this age.
	 **************************************************************************/
	public CollegeDatabase separate(PersonType type, double num, Operator operator) {
		CollegeDatabase ofType = this.separate(type);
		if (type == PersonType.EMPLOYEE) {
			ofType.bySalary(num, operator);
		}
		else{
			ofType.byGPA(num, operator);
		}
		return ofType;
	
	}
	
	/********************************************************************
	 * 		toFile Method: creates a string of comma separated information
	 * 					   about Person's in this database.
	 * 			Accesses the toFile() method of every person object in
	 * 			this database.											
	 * 			Returns a string representation of the database of Person 
	 * 			objects comma separated.									
	 ********************************************************************/	
	public String toFile() throws NullPointerException{
		String databaseString = "";
		for (int i = 0; i < size; i++) {
			try{
				databaseString += entry[i].toFile();
			}
			catch(NullPointerException exception){
				System.out.println("Cannot resolve null to a string.");
			}
		}
		return databaseString;
	}
	
	/********************************************************************
	 * 		toString Method: overrides Object.toString() 	
	 * 			Accesses the toString() method of every person object in
	 * 			this database.											
	 * 			Returns a string representation of the database of Person 
	 * 			objects.									
	 ********************************************************************/	
	public String toString() throws NullPointerException{
		String databaseString = "";
		try{
			for (int i = 0; i < size; i++) {
				databaseString += entry[i].toString();
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Cannot resolve null to a string.");
		}
		return databaseString;
	}
}
