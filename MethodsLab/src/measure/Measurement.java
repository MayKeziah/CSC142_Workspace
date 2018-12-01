package measure;

public class Measurement {
	
	public static void main(String[] args) {
		System.out.println("----------- MEASUREMENT RESULTS --------------");
		System.out.println("rectangle area: " + rectangleArea(7, 12));
		System.out.println("circle area: " + circleArea(6));
		System.out.println("spherical volume: " + sphericalVolume(6));
		System.out.println("toFahrenheit: " + toFahrenheit(100));
		System.out.println("toFahrenheit: " + toFahrenheit(0));
		System.out.println("toCelsius: " + toCelsius(212));
		System.out.println("toCelsius: " + toCelsius(32));
		System.out.println(quadratic(4, 5, -13));
		System.out.println("distance: " + distance(2, 5, 5, 9));
		System.out.println("----------- ------------------- --------------");
	}
	public static int rectangleArea(int length, int width) {
		return length * width;
	}
	public static double circleArea(int radius) {
		return Math.PI * (radius * radius);
	}
	public static double sphericalVolume(int radius) {
		return (4.0/3) * Math.PI * (radius * radius * radius);
	}
	public static double toCelsius(int f) {
		return (5.0/9.) * (f - 32);
	}
	public static double toFahrenheit(int c) {
		return (9.0/5) * c + 32;
	}
	public static String quadratic(int a, int b, int c) {
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
	public static double distance(int X1, int Y1, int X2, int Y2) {
		return Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
	}

}
