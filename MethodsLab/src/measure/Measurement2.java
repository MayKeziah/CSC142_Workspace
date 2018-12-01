package measure;

import java.util.Scanner;

public class Measurement2 {
	public static void main(String[] args) {
		System.out.println("This program makes a series of calculations given input.");
		//open keyboard of Scanner class
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		System.out.println("\n--- RECTANGLE AREA ---"); 
		System.out.println(rectangleArea(keyboard));
		System.out.println("\n--- CIRCLE AREA ---");
		System.out.println(circleArea(keyboard));
		System.out.println("\n--- SPHERICAL VOLUME ---");
		System.out.println(sphericalVolume(keyboard));
		System.out.println("\n--- CONVERT TO CELSIUS ---");
		System.out.println(toCelsius(keyboard));
		System.out.println("\n--- CONVERT TO FAHRENHEIT ---");
		System.out.println(toFahrenheit(keyboard));
		System.out.println("\n--- ROOTS OF 2nd DEGREE POLYNOMIAL ---");
		System.out.println(quadratic(keyboard));
		System.out.println("\n--- DISTANCE BETWEEN TWO POINTS ---");
		System.out.println(distance(keyboard));
		System.out.println("\n---------- END ----------");
		
		
		//Close scanner
		keyboard.close();
	}
	
	public static double rectangleArea(Scanner keyboard) {
		System.out.print("Enter a length: ");
		double l = keyboard.nextDouble();
		System.out.print("Enter a width: ");
		double w = keyboard.nextDouble();
		return l * w;
	}
	public static double circleArea(Scanner keyboard) {
		System.out.print("Enter a radius: ");
		double r = keyboard.nextDouble();
		return Math.PI * (r * r);
	}
	public static double sphericalVolume(Scanner keyboard) {
		System.out.print("Enter a radius: ");
		double r = keyboard.nextDouble();
		return (4.0/3) * Math.PI * (r * r * r);
	}
	public static double toCelsius(Scanner keyboard) {
		System.out.print("Enter a fahrenheit reading to convert: ");
		double f = keyboard.nextDouble();
		return (5.0/9.) * (f - 32);
	}
	public static double toFahrenheit(Scanner keyboard) {
		System.out.print("Enter a fahrenheit reading to convert: ");
		double c = keyboard.nextDouble();
		return (9.0/5) * c + 32;
	}
	public static String quadratic(Scanner keyboard) {
		System.out.println("Enter a, b, and c from a 2nd degree polynomial: ");
		System.out.print("a: ");
		double a = keyboard.nextDouble();
		System.out.print("b: ");
		double b = keyboard.nextDouble();
		System.out.print("c: ");
		double c = keyboard.nextDouble();
		double imaginaryTest = (b * b - 4 * a * c);
		double x_1 = (-b + Math.sqrt(imaginaryTest))/(2 * a);
		double x_2 = (-b - Math.sqrt(imaginaryTest))/(2.0*a);
		if (imaginaryTest >= 0) {
			return "quadratic roots: " + x_1 + " , " + x_2;
		}
		else {
			return "quadratic roots: imaginary";
		}
	}
	public static double distance(Scanner keyboard) {
		System.out.println("Enter the coordinates for two points (X1, Y1), (X2, Y2): ");
		System.out.print("X1: ");
		double X1 = keyboard.nextDouble();
		System.out.print("Y1: ");
		double Y1 = keyboard.nextDouble();
		System.out.print("X2: ");
		double X2 = keyboard.nextDouble();
		System.out.print("X1: ");
		double Y2 = keyboard.nextDouble();
		return Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
	}

}
