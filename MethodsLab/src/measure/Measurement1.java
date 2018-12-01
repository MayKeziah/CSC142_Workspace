package measure;
import java.util.Scanner;
public class Measurement1 {
		
		public static void main(String[] args) {
			//open keyboard of Scanner class
			Scanner keyboard;
			keyboard = new Scanner(System.in);
			
			
			System.out.println("This program does a series of calculations given input:");
			System.out.println("Type a number and then press enter to input a value");
			System.out.print("Enter a length, then enter a width: ");
			System.out.println("rectangle area: " + rectangleArea(keyboard.nextDouble(), keyboard.nextDouble()));
			System.out.print("Enter a radius: ");
			System.out.println("circle area: " + circleArea(keyboard.nextDouble()));
			System.out.print("Enter another radius: ");
			System.out.println("spherical volume: " + sphericalVolume(keyboard.nextDouble()));
			System.out.print("Enter a celsius measurement to convert: ");
			System.out.println("toFahrenheit: " + toFahrenheit(keyboard.nextDouble()));
			System.out.println("toFahrenheit: " + toFahrenheit(keyboard.nextDouble()));
			System.out.print("Enter a fahrenheit measurement to convert: ");
			System.out.println("toCelsius: " + toCelsius(keyboard.nextDouble()));
			System.out.println("toCelsius: " + toCelsius(keyboard.nextDouble()));
			System.out.print("Enter a, b, then c from a 2nd degree polynomial: ");
			System.out.println(quadratic(keyboard.nextDouble(), keyboard.nextDouble(), keyboard.nextDouble()));
			System.out.print("Enter each location value respectively for two points (X1, Y1), (X2, Y2): ");
			System.out.println("distance: " + distance(keyboard.nextDouble(), keyboard.nextDouble(), keyboard.nextDouble(), keyboard.nextDouble()));
			System.out.println("----------- ------------------- --------------");
			
			//Close keyboard
			keyboard.close();
		}
		
		public static double rectangleArea(double length, double width) {
			return length * width;
		}
		public static double circleArea(double radius) {
			return Math.PI * (radius * radius);
		}
		public static double sphericalVolume(double radius) {
			return (4.0/3) * Math.PI * (radius * radius * radius);
		}
		public static double toCelsius(double f) {
			return (5.0/9.) * (f - 32);
		}
		public static double toFahrenheit(double c) {
			return (9.0/5) * c + 32;
		}
		public static String quadratic(double a, double b, double c) {
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
		public static double distance(double X1, double Y1, double X2, double Y2) {
			return Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
		}

	}



