package features;

/*********************************************************************************
 * Copying Arrays: Array copy
 *********************************************************************************/

public class ArrayCopyClient {

	public static void main(String[] args) {
		int[] source = {2, 3, 1, 5, 8, 6};
		int[] target = new int[source.length];
		print(getCopy(source));
		copy(source, target);
		print(target);
		print(source);
		int[] s = {1, 2, 4, 6, 9};
		int[] t = new int[s.length];
		systemCopy(s, t);
		print(t);
	}
	
	/*********************************************************************************
	 * copy Method: 
	 * 		takes two integer arrays
	 * 		Sets the values inside the second array to the values in the first.
	 *********************************************************************************/
	public static void copy(int[] myList, int[] copyList) {
		for (int i = 0; i < copyList.length; i++) {
			copyList[i] = myList[i];
		}
	}

	/*********************************************************************************
	 * getCopy Method: 
	 * 		takes an integer array
	 * 		returns an array that is a copy of the input array.
	 *********************************************************************************/
	public static int[] getCopy(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < newList.length; i++) {
			newList[i] = list[i];
		}
		return newList;
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
	 * systemCopy Method: 
	 * 		takes two integer arrays
	 * 		Sets the values inside the second array to the values in the first.
	 *********************************************************************************/
	public static void systemCopy(int[] myList, int[] copyList) {
		System.arraycopy(myList, 0, copyList, 0, myList.length);
	}

}
