package shapes;

public class TestClient {
	public static void main(String[] args) {
		Shape myShape			= new Shape(2, 5);
			  myShape 			= new Rectangle(1, 2);
		Rectangle myRectangle 	= new Rectangle(3, 8);
		Circle myCircle 		= new Circle(8);
		Triangle myTriangle 	= new Triangle(3, 4, 5);
		System.out.println(myRectangle.toString());
		System.out.println(myCircle.toString());
		System.out.println(myTriangle.toString());
		System.out.println(myShape.toString());
		
//		Shapeable shape;
//		shape = new Circle(2.0);
//		System.out.println(shape.area());
//		
//		shape = new Rectangle(2.0, 4.0);
//		System.out.println(shape.area());
//		
//		shape = new Triangle(2, 3, 4);
//		System.out.println(shape.area());
	}
}
