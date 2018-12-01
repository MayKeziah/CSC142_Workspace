package lesson2;

public class Point { 	// Point object
	private int x; 		// State: data field of Point object
	private int y; 		// State: data field of Point object

	public Point () {	// Constructor: Point(); initializes the data fields of Point object
		this(1, 1);
	}
	public Point (Point p) {	// Constructor: Point(); initializes the data fields of Point object
		this(p.getX(), p.getY());
	}
	public Point (int x, int y) {	// Constructor: Point(); initializes the data fields of Point object
		this.x = x;
		this.y = y;
	}
	
	/**********************************************
	 * Alphabetically ordered methods as follows: *
	 **********************************************/
	
	public Point add(Point p) { // Accessor: use values of two points to create and return new point.
		int newX = x + p.getX();
		int newY = y + p.getY();
		return new Point(newX, newY);
	}
	
	public double distanceFromOrigin() { 	// Accessor: distanceFromOrigin retrieves the x 
		return Math.sqrt(x * x + y * y);	// and y information and returns the distance from origin
	}
	public int getX() { // Accessor: returns the current x value
		return x;
	}
	public int getY() { // Accessor: returns the current y value
		return y;
	}
	public void setLocation(int newX, int newY) { // Mutator: set x value and y value with
		x = newX;								  // values passed through parameters
		y = newY;
	}

	public void setX(int x) { // Mutator: set x value
		this.x = x;
	}
	public void setY(int y) { // Mutator: set y value
		this.y = y;
	}
	public void swap(Point myPoint) { //swap the x and y values of two points
		Point workingPoint = new Point(x, y); 
		x = myPoint.x;
		y = myPoint.y;
		myPoint.x = workingPoint.x;
		myPoint.y = workingPoint.y;
	}
	public void translate(int dx, int dy) {		// Mutator: modifies x and y data fields to new values
		x = x + dx; 							// light blue is global variable, but..
		y = y + dy; 							// the deeper blue is a local variable.	
	}

}
