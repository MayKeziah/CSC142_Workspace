package features;

/*********************************************************************************
 * Array Parameters: Passing and returning arrays.
 *********************************************************************************/

public class ParameterClient {

	public static void main(String[] args) {
		print(new int [] {1, 2, 4, 6, 9});
		int[] list1 = {1, 2, 3, 4, 5};
		increment(list1);
		print(list1);
		int[] list2 = {1, 2, 3, 4, 5};
		int[] result = reverse(list2);
		print(result);
		

	}
	
	/*********************************************************************************
	 * increment Method: increments an array
	 * 		takes an integer array,
	 * 		updates each element to its value plus one.
	 *********************************************************************************/
	public static void increment(int[] list) {
		for (int i = 0; i < (list.length); i++){
			list[i]++;
		}
	}

	/*********************************************************************************
	 * print method: print a representation of a list
	 * 		takes an integer array
	 * 		prints the indices and the value at each index.
	 *********************************************************************************/
	public static void print(int[] list) {
		String indecies = "";
		for (int i = 0; i < (list.length); i++){
			indecies = indecies + "[" + i + "] ";
			System.out.print(" " + list[i] + "  ");
		}
		System.out.println("\n" + indecies);
	}
	
	/*********************************************************************************
	 * reverse Method: 
	 * 		takes an integer array
	 * 		returns an array that is the reversal of the input array.
	 *********************************************************************************/
	public static int[] reverse(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < newList.length; i++) {
			newList[i] = list[(newList.length - 1) - i];
		}
		return newList;
	}

}
