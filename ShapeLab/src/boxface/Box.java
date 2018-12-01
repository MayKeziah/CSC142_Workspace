package boxface;

public class Box implements Expandable {
	private double width;
	private double height;
	private double length;
	
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes no arguments, initializes length and width to 1.0.
	 ************************************************************************/
	public Box() {
		this(1.0, 1.0, 1.0);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, initializes x and y of this rectangle to the
	 * 		x and y of the other rectangle. This is a 'copy constructor'.
	 ************************************************************************/
	public Box(Box other) {
		this(other.width, other.height, other.length);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes two arguments, a height and a width. Sets the data fields
	 * 		height and width to these values
	 ************************************************************************/
	public Box(double width, double height, double length) {
		this.height	= height;
		this.width	= width;
		this.length = length;
	}
	
	/************************************************************************
	 * Accessor Methods: get<DataField>() for Width, Height, and Length.
	 * 		Takes no arguments, 
	 * 		Returns the value stored by the respective data field.
	 ************************************************************************/
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLength() {
		return length;
	}
	
	/************************************************************************
	 * Mutator Method: setFields()
	 * 		Takes 3 arguments, 
	 * 		Sets the passed values for each data field.
	 ************************************************************************/
	public void setFields(double width, double height, double length) {
		this.height	= height;
		this.width	= width;
		this.length = length;
	}
	
	/************************************************************************
	 * Accessor Method: toString()
	 * 		Takes no arguments, 
	 * 		Returns the string representation of this box in the form 
	 * 		"(width, height, length)".
	 ************************************************************************/
	public String toString() {
		return "[" + width + ", " + height + ", " + length + "]";
	}
	
	/************************************************************************
	 * Accessor Method: volume()
	 * 		Takes no arguments, 
	 * 		Returns a double that is an approximate of the volume of this box.
	 ************************************************************************/
	public double volume() {
		return height * width * length;
	}
	
}
