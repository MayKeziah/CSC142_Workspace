package shapeface;

public class X_InterfaceClient {
	public static void main(String[] args) {
		/************************************************************
		 * Question 1: shape.<insertMethodName>() see below
		 * Question 2: shape.toString() or typecast ((Circular)shape).getRadius()
		 ************************************************************/
		Shapeable shape;
		shape = new Circular(5.0);
		test(shape);
		System.out.println("Radius: " 	 + shape.toString() + " OR: " + ((Circular)shape).getRadius());
		
		shape = new Rectangular(8.0, 4.0);
		test(shape);
		
		shape = new Triangular(1.0, Math.sqrt(3.0), 2.0);
		test(shape);
	}
	
	public static void test(Shapeable shape) {
		System.out.println("--------------------------------------------");
		System.out.println("toString: "  + shape.toString());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Quadruple: " + shape.quadruple());
	}

}
