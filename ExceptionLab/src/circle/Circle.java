package circle;

public class Circle {
	
	/**********************************************************
	 * State: data fields
	 *        initialize data fields 
	 **********************************************************/
	public double radius;
	
	/**********************************************************
	 * Constructor: Circle
	 *              data fields are initialized.
	 * ********************************************************/
	public Circle() {
		this(1.0);
	}
	
	/**********************************************************
	 * Constructor: Circle(Circle) 
	 *              data fields are initialized.
	 * ********************************************************/
	public Circle(Circle c) {
		this(c.radius);
	}
	
	/**********************************************************
	 * Constructor: Circle(double) 
	 *              data fields are initialized.
	 * ********************************************************/
	public Circle(double radius) {
		setRadius(radius);;
	}
	
	/**********************************************************
	 * accessor: getRadius
	 *           accesses radius field
	 **********************************************************/
	public double getRadius() {
		return radius;
	}
	
	/**********************************************************
	 * mutator: setRadius
	 *          modifies radius data field
	 **********************************************************/
	public void setRadius(double radius) throws IllegalArgumentException{
		if (radius >= 0) {
			this.radius = radius;
		}
		else {
			throw new IllegalArgumentException("Radius cannot be negative " + radius);
		}
	}
	
	/**********************************************************
	 * method: area
	 *         returns area of shape
	 **********************************************************/
	public double area() {
		return Math.PI * radius * radius;
	}
	
	/**********************************************************
	 * method: perimeter
	 *         returns perimeter of shape
	 **********************************************************/
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	/**********************************************************
	 * method: thisShape
	 * 		   displays which Shape
	 **********************************************************/
	public String thisShape() {
		return "Circle";
	}
	
	/******************************************************
	 * method: toString
	 * 		   displays parameters of Circle
	 ******************************************************/
	public String toString() {
		return "[ " + radius + " ]";
	}
	
}
