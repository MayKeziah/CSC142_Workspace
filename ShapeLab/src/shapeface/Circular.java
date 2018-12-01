package shapeface;

public class Circular implements Shapeable{
	private double radius;
	
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes no arguments, initializes radius to 1.0.
	 ************************************************************************/
	public Circular() {
		this(1.0);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, a circle object, and initializes this circle's
	 * 		radius with the radius value of the other circle 'copy constructor'.
	 ************************************************************************/
	public Circular (Circular other) {
		this(other.getRadius());
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, a double, and initializes the radius with 
	 * 		that value.
	 ************************************************************************/
	public Circular (double radius) {
		this.radius = radius;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: area()
	 * 		Takes no arguments, 
	 * 		returns a double representing the area of this circle.
	 ************************************************************************/
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: getRadius()
	 * 		Takes no arguments, 
	 * 		returns a double representing the radius of this circle (getter).
	 ************************************************************************/
	public double getRadius() {
		return radius;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: perimeter()
	 * 		Takes no arguments, 
	 * 		returns a double representing the perimeter of this circle.
	 ************************************************************************/
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	/************************************************************************
	 * MUTATOR METHOD: setRadius(arg)
	 * 		Takes one argument, a double, 
	 * 		sets the radius of this circle equal to the value passed (setter).
	 ************************************************************************/
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: thisShape()
	 * 		Takes no arguments, 
	 * 		prints the name of this class, "Circle".
	 ************************************************************************/
	public void thisShape() {
		System.out.println("Circle");
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: toString() **This is an override of Shape.toString
	 * 		Takes no arguments, 
	 * 		returns a string representation of this circle in the form "(radius)".
	 ************************************************************************/
	public String toString() {
		return "(" + radius + ")";
	}
	
	/************************************************************************
	 * MUTATOR METHOD: quadruple()
	 * 		Takes no arguments, 
	 * 		returns either a string or the value of (the data fields first added) then multiplied by 4.
	 ************************************************************************/
	public double quadruple() {
		return radius * 4.0;
	}
}
