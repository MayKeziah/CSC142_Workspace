package shapes;

import java.text.DecimalFormat;

public class Shape {
	private int x;
	private int y;
	protected DecimalFormat df = new DecimalFormat("0.00");
	
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes no arguments and initializes the x and y coordinates to 1.
	 ************************************************************************/
	public Shape() {
		this(1, 1);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, a shape object and initializes its 
	 * 		x and y coordinates with the x and y coordinates of the shape 
	 * 		object. this is a 'copy constructor'.
	 ************************************************************************/
	public Shape(Shape other) {
		this(other.getX(), other.getY());
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes two arguments (an x and a y coordinate)
	 * 		and initializes the x and y coordinates to those values.
	 ************************************************************************/
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/************************************************************************
	 * PLACEHOLDER METHODS: area(), perimeter()
	 * 		meaningless methods to be overridden.
	 ************************************************************************/
	public double area() {
		return 0.0;
	}
	public double perimeter() {
		return 0.0;
	}
	
	/************************************************************************
	 * ACCESSOR METHODS:
	 * 		Get the x and y data members (getters).
	 ************************************************************************/
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Get the "number"'s value to two decimal places.
	 ************************************************************************/
	public double hundreth(double number) {
		return Math.round(number * 100)/100.0;
	}
	
	/************************************************************************
	 * MUTATOR METHODS:
	 * 		Set the x and y data members (setters).
	 ************************************************************************/
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Receives no arguments but when called 
	 * 		prints the coordinate location of the shape in the pixelated grid to the console.
	 ************************************************************************/
	public void showCoordinates() {
		System.out.println("Coordinates: " + this.toString());
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Receives no arguments, 
	 * 		prints the name of the class, "shape".
	 ************************************************************************/
	public void thisShape() {
		System.out.println("Shape");
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Takes no arguments, 
	 * 		prints a representation of this shape in form: "(x, y)"
	 ************************************************************************/
	public String toString() {
		return ("(" + df.format(x) + ", " + df.format(y) + ")");
	}
}
