package shapes;

public class Square extends Shape{
	private double sides;
	
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes no arguments, initializes sides to 1.0.
	 ************************************************************************/
	public Square() {
		this(1.0);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, a Square, initializes sides of this square
	 * 		equal to the sides of the passed square, 'copy constructor'.
	 ************************************************************************/
	public Square(Square other) {
		this(other.getSides());
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, a double, initializes sides to the value passed.
	 ************************************************************************/
	public Square (double sides) {
		super();
		this.sides = sides;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Takes no arguments, 
	 * 		returns a double representing the area of this square.
	 ************************************************************************/
	public double area() {
		return Math.pow(sides, 2);
	}
	
	/************************************************************************
	 * ACCESSOR METHODS:
	 * 		Takes no arguments, 
	 * 		returns the data field value (getter).
	 ************************************************************************/
	public double getSides() {
		return sides;
	}
	
	/************************************************************************
	 * MUTATOR METHODS:
	 * 		Takes 1 argument, 
	 * 		sets the value of the data field (setters).
	 ************************************************************************/
	public void setSides(double sides) {
		this.sides = sides;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Takes no arguments, 
	 * 		returns a double representing the perimeter of this rectangle.
	 ************************************************************************/
	public double perimeter() {
		return 4 * sides;	
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Takes no arguments, 
	 * 		prints the name of this class, "Square".
	 ************************************************************************/
	public void thisShape() {
		System.out.println("Square");
	}
	
	/************************************************************************
	 * ACCESSOR METHOD:
	 * 		Takes no arguments, 
	 * 		returns the string representation of this rectangle in the form: "(sides)".
	 ************************************************************************/
	public String toString() {
		return "(" + sides + ")";
	}
}
