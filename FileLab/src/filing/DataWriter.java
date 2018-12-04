package filing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DataWriter {

	/*****************************************************
	 * method: main(String[])
	 *         runs program
	 * ***************************************************/
	public static void main(String[] args) throws IOException{
		// set path name
		String pathName =  
				File.separator + "U:"      + File.separator + "Documents" +
				File.separator + "CSC_142" + File.separator + "F18" + 
				File.separator + "Scores.txt";
				
		//create a file object
		File file = new File(pathName);	
		
		//check if file exists
		if (file.exists()) {
			System.out.println("File exists");
		}
		
		//create a file at the location indicated
		PrintWriter output = new PrintWriter(file);
		
		//write formatted output to file
		output.print("Jensen Jones\t");
		output.println(90);
		output.print("Juniper Riggs\t");
		output.println(88);
		output.print("Milton Badgely\t");
		output.println(72);
		
		//close the file
		output.close();

	}

}
