package filing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataReader {

	/*****************************************************************
	 * method: averageScore(Student[], int)
	 *         average score of students
	 * ***************************************************************/
	public static double averageScore(Student[] students) {
		double score = 0;
		
		//(2) complete code to find average scores of students in array
		
		return score/students.length;
	}
	
	/*****************************************************************
	 * method: sort(Student[], int)
	 *         sorted list of students
	 * ***************************************************************/
	public static void sort(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			// (3) sort elements in array by ascending order of scores
		}
	}
	
	/*****************************************************************
	 * method: write(Student[], int)
	 *         write to file
	 * ***************************************************************/
	public static void write (Student[] students) throws IOException{
		
		String pathName =  
				File.separator + "U:"      + File.separator + "Documents" +
				File.separator + "CSC_142" + File.separator + "F18" + 
				File.separator + "Sorted.txt";
		
		File file     = new File(pathName);
		
		//create a file at the location indicated
		PrintWriter output = new PrintWriter(file);
				
		//write formatted output to file
		for (int i = 0; i < students.length; i++) {
			
			// (4) write code to print array to file "Sorted"
		}
		output.close();
	}
	
	/*****************************************************
	 * method: main(String[])
	 *         runs program
	 * ***************************************************/
	public static void main(String[] args) throws IOException {
		String pathName =  
				File.separator + "U:"      + File.separator + "Documents" +
				File.separator + "CSC_142" + File.separator + "F18" + 
				File.separator + "Scores.txt";
		
		File file     = new File(pathName);
		Scanner input = new Scanner(file);
		
		String firstName;
		String lastName;
		Student[] students = new Student[20];
		int count = 0;
		
		//read in the entries, print to console and place in an array.
		while(input.hasNext()) {
			firstName = input.next();
			lastName  = input.next();
			int score = input.nextInt();
			
			//  write name and score to console
			System.out.println(firstName + " " + lastName + " " + score);
			
			// (1) enter code to write name and score to student array
			
			count++;
		}
		//close scanner
		input.close();
		
		// make an array to fit count
		Student[] entry = new Student[count];
		
		//copy from array students
		for(int i = 0; i < count; i++ ) {
			entry[i] = students[i];
		}
		
		//print count to console.
		System.out.println("count: " + count );
		
		//print out the average score of students in file.
		System.out.println("average score: " + averageScore(entry) );
		sort(entry);
		write(entry);
	}

}
