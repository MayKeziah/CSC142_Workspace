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
	
	//Scanner for error handling
	private Scanner keyboard = new Scanner(System.in);
	
	//Default constructor: File is null.
	public DatabaseStorage() {}
	
	//Sets file to be at the specified location with the specified name.
	public DatabaseStorage(String filePath) throws IOException {
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
		if (file.exists() && file.canRead()) {
			Scanner input = new Scanner(file);
			CollegeDatabase database = new CollegeDatabase(25); 
			while (input.hasNextLine()) {
				String newLine = input.nextLine();
				database.add(parsePerson(newLine));
			}
			input.close();
			
			return database;
		}
		else {
			System.out.println("The file you specified is invalid, please enter a correct filePath and try again (enter 'q' to quit).");
			String response = keyboard.next();
			if (!response.equalsIgnoreCase("q")) {
				setFile(response);
				return read();	
			}
			else {
				throw new IOException("Read error: chose not to give valid file path.");
			}

		}
	}

	/*******************************************************************************
	 * 		setFile Method: Sets the file location to be read from or written to.
	 * 				Takes one argument, a string file path.
	 * 				Creates a new File object using the file path and sets 
	 * 				the file data field equal to it.						
	 *******************************************************************************/
	public void setFile(String filePath) throws IOException{
		file = new File(filePath);
		if (!file.exists()) {
			file = null;
			throw new IOException("O/I Error: Invalid file path.");
		}
	}

	/*******************************************************************************
	 * 		write Method: Writes the contents of a database entry to a file.
	 * 				Takes one argument, a CollegeDatabase object.
	 * 				Writes information about each occupied element
	 * 				in the database to the current file. 							
	 *******************************************************************************/
	public void write(CollegeDatabase data) throws IOException {
		PrintStream writer = new PrintStream(file);
		
		if (file.exists() && file.canWrite()) {
			for (int i = 0; i < data.getSize(); i++) {
				String[] thisData = data.get(i).toString().split("\n");
				for (int j = 0; j < thisData.length; j++) {
					writer.println(thisData[j]);

				}
			}
		}
		else {
			writer.close();
			System.out.println("The file you specified is invalid, please enter a correct filePath and try again (enter 'q' to quit).");
			String response = keyboard.next();
			if (!response.equalsIgnoreCase("q")) {
				setFile(response);
				write(data);	
			}
			else {
				throw new IOException("Write error: chose not to give valid file path.");
			}
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
		
		if (file.exists() && file.canWrite()) {
			PrintStream writer = new PrintStream(file);
			for (int i = 0; i < data.getSize(); i++) {
				writer.println(data.get(i).toFile());
			}
			writer.close();
		}
		else {
			throw new IOException("Output Exception, output file does not exist.");
		}
	}
}

