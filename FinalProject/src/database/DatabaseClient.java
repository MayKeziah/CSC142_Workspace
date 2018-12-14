package database;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import database.Operator;
import database.PersonType;
import people.Employee;
import people.Person;

public class DatabaseClient {

	public static void main(String[] args) throws IOException {
		String fileLocation1 = 
		  File.separator + "C:"
		+ File.separator + "Users"
		+ File.separator + "E" 
		+ File.separator + "Documents" 
		+ File.separator + "School"
		+ File.separator + "Fall 2018" 
		+ File.separator + "CSC_142" 
		+ File.separator +  "F18" 
		+ File.separator + "College.txt";
		
		String fileLocation2 = 
		  File.separator + "C:"
		+ File.separator + "Users"
		+ File.separator + "E" 
		+ File.separator + "Documents" 
		+ File.separator + "School"
		+ File.separator + "Fall 2018" 
		+ File.separator + "CSC_142" 
		+ File.separator +  "F18" 
		+ File.separator + "TestMe.txt";
		
		DatabaseStorage input = new DatabaseStorage(fileLocation1);
		System.out.println("____________________________________________________________________________________");
		System.out.println("The following is the output of my testing of my FinalProject.");
		System.out.println("____________________________________________________________________________________");
		System.out.println();

		System.out.println("\nadd() method tests:");
		System.out.println("\nProof that my add() method does not accept repeated names: ");
		CollegeDatabase database = input.read();
		
		System.out.println("\nProof that my add() method accurately populates an array: ");
		System.out.println(database.toFile());
		
		System.out.println("\nProof that my add() method will handle (ignore) PERSON_NOT_FOUND: ");
		database.add(database.get(-9));
		database.add(new Employee("Test Name", 101, "TEST 000", 101.0));
		System.out.println(database.toFile());
		System.out.println("____________________________________________________________________________________");
		
		System.out.println("\nget() method index handling tests:");
		System.out.println("\nProof that my program handles a negative index:");
		System.out.println(database.get(-9).toFile());
		
		System.out.println("\nProof that my program handles an out-of-bounds index:");
		System.out.println(database.get(400).toFile());
		
		System.out.println("\nProof that my program handles a valid index:");
		System.out.println(database.get(0).toFile());
		System.out.println("____________________________________________________________________________________");
		
		System.out.println("\nsearch() method tests:");
		System.out.println("\nProof that my program can search for a person at the beginning of the database:");
		System.out.println("PERSON AT '1' INDEX: " + database.search(database.get(1).getName()).toFile());
		
		System.out.println("\nProof that my program can search for a person in the middle of the database:");
		System.out.println("PERSON AT '(database size) / 2' INDEX, " + database.getSize()/2 + ": " 
						 + database.search(database.get(database.getSize() / 2).getName()).toFile());
		
		System.out.println("\nProof that my program can search for a person at the end of the database:");
		System.out.println("PERSON AT '(database size) - 1' INDEX, " + (database.getSize()-1) + ": " 
						 + database.search(database.get(database.getSize() - 1).getName()).toFile());

		System.out.println("\nProof that my program can handle searching for a person not in the database:");
		System.out.println("PERSON 'fhqwgad': " + database.search("fhqwgad").toFile());
		System.out.println("____________________________________________________________________________________");

		System.out.println("\ndelete() method tests:");
		System.out.println("\nProof that my program can delete a person at the beginning of the database:");
		System.out.println("DELETE PERSON AT '1' INDEX:\t" + database.get(1).toFile());
		System.out.println("Deletion Successful: " 
						 + database.delete( database.get(1).getName() )
						 + "\n");
		System.out.println(database.toFile());
		
		System.out.println("\nProof that my program can delete a person in the middle of the database:");
		System.out.println("DELETE PERSON AT '(database size) / 2' INDEX, " 
						 + (database.getSize() / 2) + ": " + "\t" 
						 +  database.get(database.getSize() / 2).toFile());
		System.out.println("Deletion Successful: " 
				 + database.delete( database.get( database.getSize() / 2 ).getName() )
				 + "\n");
		System.out.println(database.toFile());
		
		System.out.println("\nProof that my program can delete a person at the beginning of the database:");
		System.out.println("DELETE PERSON AT '(database size) - 1' INDEX:\t" + database.get(database.getSize() - 1).toFile());
		System.out.println("Deletion Successful: " 
						 + database.delete( database.get(database.getSize() - 1).getName() )
						 + "\n");
		System.out.println(database.toFile());



		
//		DatabaseStorage output = new DatabaseStorage(fileLocation2);
//		CollegeDatabase newData = database.separate(PersonType.EMPLOYEE);
//		output.write(newData);

	}

}
