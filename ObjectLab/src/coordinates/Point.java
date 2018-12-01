package coordinates;

public class Point { 	// Point object
	public int x; 		// State: data field of Point object
	public int y; 		// State: data field of Point object

	public Point () {	//Constructor: Point(); initializes the data fields of Point object
		x = 1;
		y = 1;
	}
	public Point (Point p) {	//Constructor: Point(); initializes the data fields of Point object
		x = p.x;
		y = p.y;
	}
	public Point (int initialX, int initialY) {	//Constructor: Point(); initializes the data fields of Point object
		x = initialX;
		y = initialY;
	}
	
	/**********************************************
	 * Alphabetically ordered methods as follows: *
	 **********************************************/
	
	public Point add(Point p) { // Accessor: use values of two points to create and return new point.
		int newX = x + p.x;
		int newY = y + p.y;
		return new Point(newX, newY);
	}
	
	public double distanceFromOrigin() { 	// Accessor: distanceFromOrigin retrieves the x 
		return Math.sqrt(x * x + y * y);	// and y information and returns the distance from origin
	}
	public void setLocation(int newX, int newY) { // Mutator: set x value and y value with
		x = newX;								  // values passed through parameters
		y = newY;
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
