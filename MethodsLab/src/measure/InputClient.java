package measure;

import java.util.Scanner;

public class InputClient {
	public static void main(String[] args) {
		System.out.println("This program makes a series of calculations given input.");
		//open keyboard of Scanner class
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		System.out.println("\n--- RECTANGLE AREA ---"); 
		System.out.println(Measurement2.rectangleArea(keyboard));
		System.out.println("\n--- CIRCLE AREA ---");
		System.out.println(Measurement2.circleArea(keyboard));
		System.out.println("\n--- SPHERICAL VOLUME ---");
		System.out.println(Measurement2.sphericalVolume(keyboard));
		System.out.println("\n--- CONVERT TO CELSIUS ---");
		System.out.println(Measurement2.toCelsius(keyboard));
		System.out.println("\n--- CONVERT TO FAHRENHEIT ---");
		System.out.println(Measurement2.toFahrenheit(keyboard));
		System.out.println("\n--- ROOTS OF 2nd DEGREE POLYNOMIAL ---");
		System.out.println(Measurement2.quadratic(keyboard));
		System.out.println("\n--- DISTANCE BETWEEN TWO POINTS ---");
		System.out.println(Measurement2.distance(keyboard));
		System.out.println("\n---------- END ----------");
		
		
		//Close scanner
		keyboard.close();
	}

}
