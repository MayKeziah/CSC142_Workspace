package abstraction;

public class X_AbstractionClient {
	public static void main(String[] args) {
		/*********************************************************************************
		 * Question 1: shape.area(), shape.Perimeter() See below
		 * Question 2: shape.toString(), or type-cast ((Circular)shape).getRadius() see below
		 * Question 3: In shapes, I had to type-cast for area and perimeter. For abstraction, I do not. see below
		 * Question 4: if (PI * r^2) = 43.98 then r = sqrt(43.98/PI) see below
		 *********************************************************************************/ 
		AbstractShape shape;
		shape = new Circular(5.0);
		test(shape);
		System.out.println("Radius: " 	 + shape.toString());
		
		shape = new Rectangular(8.0, 4.0);
		test(shape);

		shape = new Triangular(1.0, Math.sqrt(3.0), 2.0);
		test(shape);

		shape = new Rectangular(1.0, 43.98);
		AbstractShape otherShape = new Circular(Math.sqrt(43.98 / Math.PI)); //Question 4!
		System.out.println(equalArea(shape, otherShape));
		
		System.out.println(Math.round(43.123 * 100)/100.0);
		System.out.println(Math.round(1234.5678 * 100)/100.0);

	}
	
	public static void test(AbstractShape shape) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("X: "	 	 + shape.getX() + "\nY: " + shape.getY());
		System.out.println("toString: "  + shape.toString());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
	}
	
	/*********************************************************************************
	 * Accessor Method: equalArea()
	 * 		This method takes two AbstractShape objects and 
	 * 		returns both areas and whether or not they are equal.
	 *********************************************************************************/ 
	public static String equalArea(AbstractShape s1, AbstractShape s2) {
		//Areas are formatted to 2 decimal places
		double a1 = Math.round(s1.area() * 100)/100.0;
		double a2 = Math.round(s2.area() * 100)/100.0;

		if (a1 == a2) {
			return "The area of the first shape is: " + s1.area() + ". \nThe area of the second shape is: " + s2.area() + ".\nThey are equal.";
		}
		else {
			return "The area of the first shape is: " + s1.area() + ". \nThe area of the second shape is: " + s2.area() + ".\nThey are not equal.";
		}
	}

}
