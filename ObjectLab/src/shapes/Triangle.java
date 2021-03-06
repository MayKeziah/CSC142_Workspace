package shapes;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;
	
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes no arguments, initializes sides a, b, and c to 1.0.
	 ************************************************************************/
	public Triangle() {
		this(1.0, 1.0, 1.0);
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes one argument, a triangle object, and  initializes the
	 * 		sides of this triangle equal to the sides of the passed triangle.
	 ************************************************************************/
	public Triangle(Triangle other) {
		this(other.getA(), other.getB(), other.getC());
	}
	/************************************************************************
	 * CONSTRUCTOR:
	 * 		Takes 3 arguments, initializes sides a, b, and c with the 
	 * 		passed values.
	 ************************************************************************/
	public Triangle(double A, double B, double C) {
		super();
		a = A;
		b = B;
		c = C;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: area()
	 * 		Takes no arguments, 
	 * 		returns a double representing the area of this triangle.
	 ************************************************************************/
	public double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	/************************************************************************
	 * ACCESSOR METHODS: getA(), getB(), getC()
	 * 		Takes no arguments, returns a double representing the data fields
	 * 		or more specifically the length of the sides of this triangle (getter).
	 ************************************************************************/
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: perimeter()
	 * 		Takes no arguments, returns a double representing the perimeter
	 * 		of this triangle.
	 ************************************************************************/
	public double perimeter() {
		return a + b + c;
	}
	
	/************************************************************************
	 * MUTATOR METHODS: setFields(arg1, arg2, arg3), setA(arg), setB(arg), setC(arg)
	 * 		Takes 1 or 3 arguments, 
	 * 		sets the value of the data fields (setters).
	 ************************************************************************/
	public void setFields(double A, double B, double C) {
		a = A;
		b = B;
		c = C;
	}
	public void setA(double A) {
		a = A;
	}
	public void setB(double B) {
		b = B;
	}
	public void setC(double C) {
		c = C;
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: thisShape()
	 * 		Takes no arguments, 
	 * 		Prints the name of this class, "Triangle".
	 ************************************************************************/
	public void thisShape() {
		System.out.println("Triangle");
	}
	
	/************************************************************************
	 * ACCESSOR METHOD: toString()
	 * 		Takes no arguments, 
	 * 		returns the string representation of this triangle in the form: "(a, b, c)".
	 ************************************************************************/
	public String toString() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
}
