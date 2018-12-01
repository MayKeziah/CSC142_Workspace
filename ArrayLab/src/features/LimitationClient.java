package features;

/*********************************************************************************
 * Arrays Class: Array Limitations
 *********************************************************************************/

import java.util.Arrays;
public class LimitationClient {

	public static void main(String[] args) {
		/*********************************************************************************
		 * toString Question 1.a. See output
		 *********************************************************************************/
		useToString();
		
		
		/*********************************************************************************
		 * sort Question 2.a. See output
		 * 				   b. no, it modifies the existing array.
		 * 			  	   c. Sorts a partial list from list[1] to list[4-1].
		 *********************************************************************************/
		useSort();
		
		
		/*********************************************************************************
		 * parallelSort Question 3.a. see output
		 *********************************************************************************/
		useParallelSort();
		
		
		/*********************************************************************************
		 * binarySearch Question 4.a. see output
		 *********************************************************************************/
		useBinarySearch();
		
		/*********************************************************************************
		 * equals Question 5.a. see output
		 *********************************************************************************/
		useEquals();
		
		/*********************************************************************************
		 * fill Question 6.a. see output
		 * 				   b. list4 was filled with all 5's.
		 * 					  list5 was filled with 8's, but only from list5[1] to list5[3].
		 *********************************************************************************/
		useFill();
	}
	
	/*********************************************************************************
	 * useToString Method: Calls Arrays.toString() method to print a string 
	 * 		representation of the array.
	 *********************************************************************************/
	public static void useToString() {
		int[] numbers = {4, 1, 9, 3, 7, 5, 2};
		System.out.println("toString: \n" + Arrays.toString(numbers) + "\n");
	}
	
	/*********************************************************************************
	 * useSort Method: Calls Arrays.sort() method to arrange the elements into 
	 * 		sorted order and prints the sorted array
	 *********************************************************************************/
	public static void useSort() {
		int[] numbers = {4, 1, 9, 3, 7, 5, 2};
		Arrays.sort(numbers, 1, 4);
		System.out.println("sort: \n" + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers) + "\n");
	}
	
	/*********************************************************************************
	 * useParallelSort Method: Calls Arrays.parallelSort() method to arrange the elements into 
	 * 		sorted order and prints the sorted array
	 *********************************************************************************/
	public static void useParallelSort() {
		int[] digits = {7, 9, 2, 8, 5, 1, 3};
		Arrays.parallelSort(digits, 1, 4);
		System.out.println("parallelSort: \n" + Arrays.toString(digits));
		Arrays.parallelSort(digits);
		System.out.println(Arrays.toString(digits) + "\n");
	}
	
	/*********************************************************************************
	 * useBinarySearch Method: Calls Arrays.binarySearch() method to find a given value
	 * 		in a sorted array. Prints the index if found, prints the -(insertionIndex + 1)
	 * 		if not found.
	 *********************************************************************************/
	public static void useBinarySearch() {
		int[] numbers = {4, 1, 9, 3, 7, 5, 2};
		Arrays.sort(numbers);
		System.out.println("binarySearch: \n" + Arrays.binarySearch(numbers, 5));
		System.out.println(Arrays.binarySearch(numbers, 6) + "\n");
	}
	
	/*********************************************************************************
	 * useEquals Method: Calls Arrays.equals() method to check if two arrays are
	 * 		strictly equal and prints the result as a boolean.
	 *********************************************************************************/
	public static void useEquals() {
		int[] list1 = {2, 4, 6, 7, 9};
		int[] list2 = {2, 4, 6, 7, 9};	
		int[] list3 = {1, 2, 4, 6, 9};
		System.out.println("equals: \n" + Arrays.equals(list1, list2));
		System.out.println(Arrays.equals(list1, list3) + "\n");	
	}
	
	/*********************************************************************************
	 * useFill Method: Calls Arrays.fill() method to fill an array with a given value,
	 * 		and prints the result.
	 *********************************************************************************/
	public static void useFill() {
		int[] list4 = {2, 4, 6, 9, 7, 5};
		int[] list5 = {1, 3, 5, 8, 6, 9};
		Arrays.fill(list4, 5);
		System.out.println("fill: \n" + Arrays.toString(list4));
		Arrays.fill(list5, 1, 4, 8);
		System.out.println(Arrays.toString(list5) + "\n");
	}
}
