package lesson2;

public class Line {
	/* Variable (data fields / state): Initialize object variables */
	private Point p1;
	private Point p2;
	
	/* Constructors: Initialize object or Line class */
	
	public Line (Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Line (int x1, int y1, int x2, int y2) {
		/*this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);*/
		this(new Point(x1, y1), new Point(x2, y2));
	}
	
	/* Accessors: access data fields and return data */
	
	public Line add(Line l1, Line l2) {
		Point newPt1 = l1.getPoint1().add(l2.getPoint1());
		Point newPt2 = l1.getPoint2().add(l2.getPoint2());
		return new Line(newPt1, newPt2);
		
	}
	public Point getPoint1() {
		return this.p1;
	}
	public Point getPoint2() {
		return p2;
	}
	
	public String toString() {
		return ("[(" + this.p1.getX() + ", " + this.p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]");
	}
	
	public double getSlope() {
		double dy = p2.getY() - p1.getY();
		double dx = p2.getX() - p1.getX();
		if (dx == 0.0) {
			System.out.println("Zero Division is not allowed, returned value of the change in x:");
			return dx;	
		}
		else {
			return (dy/dx);
		}
	}
	

}
