package database;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import database.CollegeDatabase.Operator;
import database.CollegeDatabase.PersonType;
import people.Person;

public class DatabaseClient {

	public static void main(String[] args) throws IOException {
		String fileLocation1 = File.separator + "C:"
		+ File.separator + "Users"
		+ File.separator + "E" 
		+ File.separator + "Documents" 
		+ File.separator + "School"
		+ File.separator + "Fall 2018" 
		+ File.separator + "CSC_142" 
		+ File.separator +  "F18" 
		+ File.separator + "College.txt";
		
		String fileLocation2 = File.separator + "C:"
		+ File.separator + "Users"
		+ File.separator + "E" 
		+ File.separator + "Documents" 
		+ File.separator + "School"
		+ File.separator + "Fall 2018" 
		+ File.separator + "CSC_142" 
		+ File.separator +  "F18" 
		+ File.separator + "TestMe.txt";
		
		DatabaseStorage input = new DatabaseStorage(fileLocation1);
		CollegeDatabase database = input.read();
		DatabaseStorage output = new DatabaseStorage(fileLocation2);
//		CollegeDatabase myTest = output.read();
//		myTest.print();
//		database.print();
//		database.separate("Employee").print();
		CollegeDatabase test1 = database.separate(PersonType.STUDENT, 3.0, Operator.OVER);
//		database.deleteDatabase(test1);
//		CollegeDatabase test2 = database.separate(PersonType.STUDENT);
		System.out.println("X X X X X X X X X X X X X X X X X");
//		test1.add(test2);
		test1.print();
//		database.separate(20).print();
//		CollegeDatabase myTest = database.separate(PersonType.EMPLOYEE, 58000.0, Operator.OVER);
//		Person tryMe = myTest.pop("Jessup Wingo");
//		myTest.printCommaSeparated();
//		System.out.println(tryMe.toFile());
//		System.out.println(Arrays.toString(database.getDatabase()));
//		System.out.println(database.getSize());
//		Person myGuy = database.search("Holden Leuty");
//		int guySpot = database.findLocation("Holden Leuty");
//		System.out.println("Location: " + guySpot);
//		System.out.println(database.get(guySpot).toString());
//		System.out.println(myGuy.toString());
//		System.out.println("HHHHH\n" + Arrays.toString(database.getDatabase()));
		
//		output.writeCommaSeperated(test1);
//		output.write(test1);
//		database.separate(20, "over").print();
		/*
		 * NEXT: Correct / add headers as needed
		 * Then continue testing
		 */
	}

}
