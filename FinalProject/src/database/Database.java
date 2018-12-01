package database;

import people.Person;


/******************************************************************************
 * 		Database Interface: 												
 * 			This interface will direct any class that implements it 
 * 			to add, delete, or search for a person in the database								
 ******************************************************************************/
public interface Database {
	
	
	/**************************************************************************
	 * 		add Method: adds a new Person object to the database.
	 * 			Takes one parameter, a Person object, and adds it to the 
	 * 			existing database. Does not allow duplicate names. 
	 * 			when Database is too full, add expands it to accommodate 
	 * 			new entries.									
	 **************************************************************************/
	public void add(Person person);
	
	
	/**************************************************************************
	 * 		delete Method: deletes a specific Person from the database.
	 * 			Takes one parameter, a Person object. It uses the name to
	 * 			find the location in the database of the entry to delete
	 * 			and the following entries are shifted to fill the deleted
	 * 			location.	
	 **************************************************************************/
	public boolean delete(String name);
	
	/**************************************************************************
	 * 		search Method: Searches for a specific Person in the database.
	 * 			Takes one parameter, a String of a Person's name.
	 * 			If found, it returns the Person's information. 
	 * 			If not found, it returns a "Person not in Database" statement.
	 **************************************************************************/
	public Person search(String name);
}
