package paths;

import java.io.File;

public class FilePropertiesTest {

	public static void main(String[] args) {
		
		// set path name
		String pathName =  
						  File.separator + "C:"
						+ File.separator + "Users"
						+ File.separator + "E" 
						+ File.separator + "Documents" 
						+ File.separator + "School"
						+ File.separator + "Fall 2018" 
						+ File.separator + "CSC_142" 
						+ File.separator + "Scores.txt";
		
		//create a file object
		File file = new File(pathName);	
		
		//properties of a file
		System.out.println("Does the file exist? " + file.exists());
		System.out.println("The file has: " + file.length() + " bytes");
		System.out.println("Can the file be read? " + file.canRead());
		System.out.println("Can the file be written? " + file.canWrite());
		System.out.println("Does the file object represent a directory? " + file.isDirectory());
		System.out.println("Does the file object represent a file? " + file.isFile());
		System.out.println("Was the file object created using an absolute path name? " + file.isAbsolute());
		System.out.println("Is the file object hidden? " + file.isHidden());
		System.out.println("Absolute File Path: " + file.getAbsolutePath());
		System.out.println("File last modified: " + file.lastModified());
		
		
		//record observations
	}

}
