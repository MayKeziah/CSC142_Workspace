package database;

import java.io.File;

import people.*;

public class DataTestClient {
	public static void main(String[] args) {
		String line  = "Student,Virginia Alcott,23,JUNIOR,3.0";
		String line2 = "Employee,Jenner Gert,42,STEM 215,54025.00";
		parsing(line);
		System.out.println();
		parsing(line2);
		
//		String fileLocation = "C:\\Users\\E\\Documents\\School\\Fall 2018\\CSC_142\\F18";
//		String fileLocation = File.separator + "C:"
//							+ File.separator + "Users"
//							+ File.separator + "E" 
//							+ File.separator + "Documents" 
//							+ File.separator + "School"
//							+ File.separator + "Fall 2018" 
//							+ File.separator + "CSC_142" 
//							+ File.separator +  "F18" 
//							+ File.separator + "College.txt";
	}
	
	public static void parsing(String line) {
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
		
		for (int i = 0; i < info.length; i++) {
			System.out.println("index " + i + " : " + info[i]);
		}
		System.out.println(anyPerson.toString());
	}

}
