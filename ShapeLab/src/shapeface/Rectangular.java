package shapeface;

public class Rectangular implements Shapeable{
	private double height;
	private double width;

	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes no arguments, initializes length and width to 1.0.
	 ************************************************************************/
	public Rectangular() {
		this(1.0, 1.0);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, initializes x and y of this rectangle to the
	 * 		x and y of the other rectangle. This is a 'copy constructor'.
	 ************************************************************************/
	public Rectangular (Rectangular other) {
		this(other.getHeight(), other.getWidth());
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes two arguments, a height and a width. Sets the data fields
	 * 		height and width to these values
	 ************************************************************************/
	public Rectangular (double height, double width) {
		this.height	= height;
		this.width	= width;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: area()
	 * 		Takes no arguments, 
	 * 		returns a double representing the area of this rectangle.
	 ************************************************************************/
	public double area() {
		return height * width;
	}
	
	/************************************************************************
	 * ACCESSOR METHODS: getHeight(), getWidth()
	 * 		Takes no arguments, 
	 * 		returns the data field values (getters).
	 ************************************************************************/
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: perimeter()
	 * 		Takes no arguments, 
	 * 		returns a double representing the perimeter of this rectangle.
	 ************************************************************************/
	public double perimeter() {
		return 2 * (height + width);	
	}
	
	/************************************************************************
	 * MUTATOR METHODS: setFields(arg1, arg2), setHeight(arg), setWidth(arg)
	 * 		Takes 1 to 2 arguments, 
	 * 		sets the value of the data fields (setters).
	 ************************************************************************/
	public void setFields(double height, double width) {
		this.height	= height;
		this.width	= width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width	= width;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: thisShape()
	 * 		Takes no arguments, 
	 * 		prints the name of this class, "Rectangle".
	 ************************************************************************/
	public void thisShape() {
		System.out.println("Rectangle");
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: toString() **This is an override of Shape.toString
	 * 		Takes no arguments, 
	 * 		returns the string representation of this rectangle in the form: "(height, width)".
	 ************************************************************************/
	public String toString() {
		return "(" + height + ", " + width + ")";
	}
	
	/************************************************************************
	 * MUTATOR METHOD: quadruple()
	 * 		Takes no arguments, 
	 * 		returns the value of the (datafields added together) and then multiplied by 4.
	 ************************************************************************/
	public double quadruple() {
		return (height + width) * 4;
	}
}