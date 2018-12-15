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
		database.add(database.get(0));
		
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
		System.out.println(database.get(database.getSize() + 400).toFile());
		
		System.out.println("\nProof that my program handles a valid index:");
		System.out.println(database.get(0).toFile());
		System.out.println("____________________________________________________________________________________");
		
		System.out.println("\nsearch() method tests:");
		System.out.println("\nProof that my program can search for a person at the beginning of the database:");
		System.out.println("PERSON AT '0' INDEX: " + database.search(database.get(0).getName()).toFile());
		
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
		System.out.println("DELETE PERSON AT '0' INDEX:\t" + database.get(0).toFile());
		System.out.println("Deletion Successful: " 
						 + database.delete( database.get(0).getName() )
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
		
		System.out.println("\nProof that my program can delete a person at the end of the database:");
		System.out.println("DELETE PERSON AT '(database size) - 1' INDEX:\t" + database.get(database.getSize() - 1).toFile());
		System.out.println("Deletion Successful: " 
						 + database.delete( database.get(database.getSize() - 1).getName() )
						 + "\n");
		System.out.println(database.toFile());

		System.out.println("\nProof that my delete() method can handle a Person not in the database:");
		System.out.println("DELETE PERSON THAT DOES NOT EXIST:\t" + database.search("Keturah Rahel").toFile());
		System.out.println("Deletion Successful: " 
						 + database.delete("Keturah Rahel")
						 + "\n");
		System.out.println(database.toFile());
		System.out.println("____________________________________________________________________________________");

		System.out.println("\nSeparation criteria tests:");
		
		System.out.println("\nEmployee Separation tests:");
		
		System.out.println("\nProof that my program can separate a database into a database of Employees:");
		System.out.println(database.separate(PersonType.EMPLOYEE).toFile());

		System.out.println("\nProof that my program can separate a database into a database of Employees with salaries over $55,000.00:");
		System.out.println(database.separate(PersonType.EMPLOYEE, 55000.00, Operator.OVER).toFile());
		
		System.out.println("\nProof that my program can separate a database into a database of Employees over 40-years-old:");
		System.out.println(database.separate(PersonType.EMPLOYEE).separate(40, Operator.OVER).toFile());
		
		System.out.println("\nStudent Separation tests:");
		
		System.out.println("\nProof that my program can separate a database into a database of Students:");
		System.out.println(database.separate(PersonType.STUDENT).toFile());
		
		System.out.println("\nProof that my program can separate a database into a database of Students with GPA's under 2.0:");
		System.out.println(database.separate(PersonType.STUDENT, 2.0, Operator.UNDER).toFile());
		
		System.out.println("\nProof that my program can separate a database into a database of Students with GPA's under 3.0:");
		System.out.println(database.separate(PersonType.STUDENT, 3.0, Operator.UNDER).toFile());
		
		System.out.println("\nProof that my program can separate a database into a database of Students under 25-years-old:");
		System.out.println(database.separate(PersonType.STUDENT).separate(25, Operator.UNDER).toFile());
		
		System.out.println("____________________________________________________________________________________");

		System.out.println("\nWrite test:");
		System.out.println("\nProof that my program can write to a file in a formated way for a user, see fileLocation2 (please set path before testing)");
		DatabaseStorage output = new DatabaseStorage(fileLocation2);
		output.write(database);
		database.print();
		
		System.out.println("____________________________________________________________________________________");
		System.out.println("____________________________________________________________________________________");


	}

}
