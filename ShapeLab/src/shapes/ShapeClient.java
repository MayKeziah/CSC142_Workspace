package shapes;

public class ShapeClient {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Circle(10.0);
		System.out.println(((Circle) shape).toString());
		System.out.println("x: " + ((Circle) shape).getX() + "\ny: " + shape.getY());
		System.out.println("Area: " + 		((Circle) shape).area());
		System.out.println("Perimeter: " + 	((Circle) shape).perimeter());
		System.out.println("Radius: " + ((Circle) shape).getRadius());	
		System.out.println();
		
		shape = new Rectangle(2.0, 6.0);
		System.out.println(((Rectangle) shape).toString());
		System.out.println("x: " + ((Rectangle) shape).getX() + "\ny: " + shape.getY());
		System.out.println("Area: " + 		((Rectangle) shape).area());
		System.out.println("Perimeter: " + 	((Rectangle) shape).perimeter());
		System.out.println();	
		
		shape = new Triangle(3.0, 4.0, 5.0);
		System.out.println(((Triangle) shape).toString());
		System.out.println("x: " + ((Triangle) shape).getX() + "\ny: " + shape.getY());
		System.out.println("Area: " + 		((Triangle) shape).area());
		System.out.println("Perimeter: " + 	((Triangle) shape).perimeter());
		System.out.println();	
	}

}
