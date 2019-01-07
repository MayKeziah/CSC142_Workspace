package studyExercises;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class TestStuff {
	public static void main(String[] args) throws FileNotFoundException {
//		int[] a1 = {2, 4, 6, 8, 10, 12, 14, 16};
//		int[] a2 = {1, 1, 2, 3, 5, 8, 13, 21};
//		mystery(a1, a2);
//		halfCaps();
		int[] myList = {1, 1, 2, 3, 3, 3, 4, 4, 4, 5};
//		counter();
		System.out.println(mode(myList));
	}
	
	public static int mode(int[] myList) {
		int length = myList.length;
		int[][] myNewList = new int[length][2];
		int currentValue = myList[0];
		int currentCount = 1;
		int uniqueValueCount = 0;
		int toReturn;
		for (int i = 1; i < length; i++) {
			if (currentValue == myList[i]) {
				currentCount++;
			}
			else {
				
				myNewList[uniqueValueCount][0] = currentCount;
				myNewList[uniqueValueCount][1] = currentValue;
				uniqueValueCount++;
				currentValue = myList[i];
				currentCount = 1;
				if(i == length - 1) {
					myNewList[uniqueValueCount][0] = currentCount;
					myNewList[uniqueValueCount][1] = currentValue;
				}
			}
		}
		for (int k = 0; k <= uniqueValueCount; k++) {
			System.out.println(Arrays.toString(myNewList[k]));
			
		}
		return 1;
	}
	public static void counter() throws FileNotFoundException {
		String fileLocation2 = 
				  File.separator + "C:"
				+ File.separator + "Users"
				+ File.separator + "E" 
				+ File.separator + "Documents" 
				+ File.separator + "School"
				+ File.separator + "Fall 2018" 
				+ File.separator + "CSC_142" 
				+ File.separator +  "F18" 
				+ File.separator + "wordCountTest.txt";
		File input = new File(fileLocation2);
		if (input.exists() && input.canRead()) {
			Scanner keyboard = new Scanner(input);
			int lineCount = 0;
			int wordCount = 0;
			while (keyboard.hasNextLine()) {
				String myString = keyboard.nextLine();
				lineCount++;
				if(!myString.equals("")) {
					wordCount += myString.split(" ").length;
				}
			}
			double avgWordPerLine = Math.round((1.0 * wordCount / lineCount) * 1000)/1000.0;
			keyboard.close();
			System.out.println("Total lines = " + lineCount + "\n" +
							   "Total words = " + wordCount + "\n" +
							   "Average words per line = " + avgWordPerLine);
		}
	}
	
	public static void halfCaps() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String[] myStringArray = keyboard.nextLine().split(" ");
		int length = myStringArray.length;
		String toPrint = "";
		for (int i = 0; i < length; i++) {
			if ((i % 2) == 0) {
				myStringArray[i] = myStringArray[i].toLowerCase();
			}
			else {
				myStringArray[i] = myStringArray[i].toUpperCase();
			}
			toPrint += myStringArray[i] + " ";
			
		}
		System.out.println(toPrint);
		keyboard.close();

	}
	public static void mystery(int[] a, int[]b) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[2 * i % a.length]- b[3* i % b.length];
		}
		System.out.print(Arrays.toString(a));
	}

}
