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
						  File.separator + "C:"
						+ File.separator + "Users"
						+ File.separator + "E" 
						+ File.separator + "Documents" 
						+ File.separator + "School"
						+ File.separator + "Fall 2018" 
						+ File.separator + "CSC_142" 
						+ File.separator +  "F18" 
						+ File.separator + "Scores.txt";
				
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
		output.print("Michael Chang\t");
		output.println(87);
		output.print("Truman Jung\t");
		output.println(73);
		output.print("Frank Carter\t");
		output.println(65);
		output.print("Samuel Huynh\t");
		output.println(77);
		output.print("Hugh Knowles\t");
		output.println(79);
		output.print("Kyle Barker\t");
		output.println(95);
		output.print("Tamsin Miles\t");
		output.println(85);
		
		//close the file
		output.close();

	}

}
