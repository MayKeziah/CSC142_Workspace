package features;
//import java.util.Arrays;

/*********************************************************************************
 * Array Basics: Traversing Arrays Lesson
 *********************************************************************************/
public class BasicClient {

	public static void main(String[] args) {
		int[] roomA = {19, 23, 21, 32, 35, 25, 27, 28, 31, 24};
		int[] roomB = {20, 24, 31, 22, 35, 34, 29, 30, 36, 26, 39};
		task(roomA);
		task(roomB);
	}
	
	
	/*********************************************************************************
	 * aboveThirty Method: 
	 * 		Takes an integer array of students' ages,
	 * 		prints the number of students whose age is above thirty.
	 *********************************************************************************/
	public static void aboveThirty(int[] roomX) {
		int above = 0;
		int i;
		for (i = 0; i < roomX.length; i++) {
			if (roomX[i] > 30) {
				above++;
			}
		}
		System.out.println("Number of students older than 30: " + above);
	}
	
	/*********************************************************************************
	 * averageAge Method: Find average
	 * 		takes an integer array of students' ages,
	 * 		prints the average age of students in a class.
	 *********************************************************************************/
	public static void averageAge(int[] roomX) {
		int i;
		int sum = 0;
		for (i = 0; i < roomX.length; i++) {
			sum = sum + roomX[i];
		}
		double avg = sum/roomX.length;
		System.out.println("Average student age: " + avg);
	}
	
	/*********************************************************************************
	 * count Method: counts the array
	 * 		Takes an integer array
	 * 		Returns the number of elements in the array.
	 *********************************************************************************/
	public static int count(int[] roomX) {
		return roomX.length;
	}
	
	/*********************************************************************************
	 * highestAge Method: 
	 * 		Takes an integer array of students' ages,
	 * 		prints the highest age in the class.
	 *********************************************************************************/
	public static void highestAge(int[] roomX) {
		int currentHigh = roomX[0];
		int i;
		for (i = 1; i < roomX.length; i++) {
			if (roomX[i] > currentHigh) {
				currentHigh = roomX[i];
			}
		}
		System.out.println("Oldest student is: " + currentHigh + " y.o.");
	}
	
	/*********************************************************************************
	 * lowestAge Method: 
	 * 		Takes an integer array of students' ages,
	 * 		prints the lowest age in the class.
	 *********************************************************************************/
	public static void lowestAge(int[] roomX) {
		int currentLow = roomX[0];
		int i;
		for (i = 1; i < roomX.length; i++) {
			if (roomX[i] < currentLow) {
				currentLow = roomX[i];
			}
		}
		System.out.println("Youngest student is: " + currentLow + " y.o.");
	}


	/*********************************************************************************
	 * print method: print a representation of a list
	 * 		takes an integer array
	 * 		prints the indices and the value at each index.
	 *********************************************************************************/
	public static void print(int[] roomX) {
		int i;
		String indecies = "";
		System.out.println("Ages of students in current room:");
		for (i = 0; i < (roomX.length); i++){
			indecies = indecies + "[" + i + "] ";
			System.out.print(roomX[i] + "  ");
		}
		System.out.println("\n" + indecies);
	}


	/*********************************************************************************
	 * task Method: test all methods
	 * 		Takes an integer array and
	 * 		prints information about the list.
	 *********************************************************************************/
	public static void task(int[] roomX) {
		System.out.println("-------------------------------------------");
		print(roomX);
		averageAge(roomX);
		aboveThirty(roomX);
		lowestAge(roomX);
		highestAge(roomX);
		System.out.println("-------------------------------------------\n");
	}

}
