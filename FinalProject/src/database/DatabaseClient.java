package database;

import java.io.File;
import java.io.IOException;

import database.CollegeDatabase.Operator;
import database.CollegeDatabase.PersonType;

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
		
		DatabaseStorage storage = new DatabaseStorage(fileLocation1);
		CollegeDatabase database = storage.read();
		database.print();
//		database.separate("Employee").print();
		System.out.println("X X X X X X X X X X X X X X X X X");
//		database.separate(20).print();
		database.separate(PersonType.EMPLOYEE, 58000.0, Operator.OVER).print();
//		database.separate(20, "over").print();
		/*
		 * NEXT: Correct / add headers as needed
		 * Then continue testing
		 */
	}

}