package database;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import people.Employee;
import people.Person;
import people.Status;
import people.Student;

/***********************************************************************************
 * 		DatabaseStorage Class: 												
 * 			This class manages the file input and output for a Database object 
 * 			and for any other classes in the program. It is able to read, 
 * 			write, and understand files across several computer platforms. 								
 ***********************************************************************************/
public class DatabaseStorage {
	//A file object
	private File file;
	
	public DatabaseStorage(String filePath) {
		setFile(filePath);
	}
	
	
	/*******************************************************************************
	 * 		parsePerson Method: Returns an object compatible with a person object
	 * 				Takes one argument, a string line.
	 * 				Returns a Person of type Student or Employee.							
	 *******************************************************************************/
	public Person parsePerson(String line) throws IllegalArgumentException, NumberFormatException {
		String[] info	 = line.split(",");
		Person anyPerson = null;
		String 	 name	 = info[1];
		int 	 age	 = Integer.parseInt(info[2]);
		Person 	 person  = new Person(name, age);
		
		if (info[0].equals("Student")) {
			Status   status = Status.valueOf(info[3]);
			double   gpa	= Double.parseDouble(info[4]);
			anyPerson 		= new Student(person, status, gpa);
		}
		else if (info[0].equals("Employee")) {
			String office = info[3];
			double salary = Double.parseDouble(info[4]);
			anyPerson 	  = new Employee(person, office, salary);
		}
		return anyPerson;
	}
	
	/*******************************************************************************
	 * 		read Method: translates lines in a file to a database of person type
	 * 				Takes no arguments							
	 *******************************************************************************/
	public CollegeDatabase read() throws IOException {
		Scanner input = new Scanner(file);
		CollegeDatabase database = new CollegeDatabase(25); 
		while (input.hasNextLine()) {
			String newLine = input.nextLine();
			database.add(parsePerson(newLine));
		}
		input.close();
		return database;
	}

	/*******************************************************************************
	 * 		setFile Method: Sets the file location to be read from or written to.
	 * 				Takes one argument, a string file path.
	 * 				Creates a new File object using the file path and sets 
	 * 				the file data field equal to it.						
	 *******************************************************************************/
	public void setFile(String filePath) {
		file = new File(filePath);
	}
	
	/*******************************************************************************
	 * 		write Method: Writes the contents of a database entry to a file.
	 * 				Takes one argument, a CollegeDatabase object.
	 * 				Writes information about each occupied element
	 * 				in the database to the current file. 							
	 *******************************************************************************/
	public void write(CollegeDatabase data) throws IOException {
		PrintStream writer = new PrintStream(file);
		
		if (file.exists()) {
			writer.println(data.toString() + "\n");
		}
		else {
			writer.close();
			throw new IOException("File invalid, cannot write to invalid file.");
		}
		writer.close();
	}
	
	/*******************************************************************************
	 * 		writeCommaSeperated Method: Writes the contents of a database entry to a file.
	 * 				Takes one argument, a CollegeDatabase object.
	 * 				Writes information, separated by commas, about each occupied element
	 * 				in the database to the current file. 							
	 *******************************************************************************/
	public void writeCommaSeperated(CollegeDatabase data) throws IOException {
		PrintStream writer = new PrintStream(file);
		
		if (file.exists()) {
			for (int i = 0; i < data.getSize(); i++) {
				writer.println(data.get(i).toFile() + ", ");
			}
		}
		else {
			writer.close();
			throw new IOException("Output Exception, output file does not exist.");
		}
		writer.close();
	}
}

