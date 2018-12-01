/* Keziah May
 * Due 10/02/18
 * CSC 142
 * Activity3_Algorithms_Redundancy
 */
package first;

public class ActivityIII {
	//this is a program that prints an 'egg', a 'teacup', a 'stopsign', and a 'hat'
	public static void main(String[] args) {
		egg();
		teaCup();
		stopSign();
		hat();
	}
	
	//Prints an egg
	public static void egg() {
		openDown();
		openUp();
		System.out.println();
	}
	//Prints a teacup
	public static void teaCup() {
		openUp();
		lid();
	}
	//Prints a stopsign
	public static void stopSign() {
		openDown();
		System.out.println("|  STOP  |");
		openUp();
	}
	//Prints a hat
	public static void hat() {
		openDown();
		lid();
	}
	//This method prints a downward arch
	public static void openDown() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	//this method prints an upward arch
	public static void openUp() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	//this method prints a particular line
	public static void lid() {
		System.out.println("+--------+");
	}
}

