package database;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import database.Operator;
import database.PersonType;
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
		CollegeDatabase newData = database.separate(PersonType.EMPLOYEE);
		output.writeCommaSeperated(newData);
		String e = "my edit";

	}

}
