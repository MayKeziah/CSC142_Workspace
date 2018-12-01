package shapes;

public class X_ShapeClient {
	public static void main(String[] args) {
		Shape shape;
		shape = new Circle (5.0);
		shape.setX(4);
//		Circle myShape = (Circle)shape;
		test(shape);
		System.out.println("Area: " + ((Circle)shape).area());
		System.out.println("Perimeter: " + ((Circle)shape).perimeter());
		/***********************************************************************
		 * Question 1: you must type-cast i.e. ((Circle)shape).area();
		 * Question 2: use toString()
		 * Question 3: This is really a philosophical question. Does it make sense?
		 * 				Yes and no.. if it works, sure, but an undefined shape has no
		 * 				defined area or perimeter.
		 ***********************************************************************/
		
		shape = new Rectangle(8.0, 4.0);
		test(shape);
		System.out.println("Area: " + ((Rectangle)shape).area());
		System.out.println("Perimeter: " + ((Rectangle)shape).perimeter());
		
		shape = new Triangle(1.0, Math.sqrt(3.0), 2.0);
		shape.setX(8);
		test(shape);
		System.out.println("Area: " + ((Triangle)shape).area());
		System.out.println("Perimeter: " + ((Triangle)shape).perimeter());
		
	}
	
	public static void test(Shape shape) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("X: " + shape.getX() + "\nY: " + shape.getY());
		System.out.println("toString: " + shape.toString());
	}

}
