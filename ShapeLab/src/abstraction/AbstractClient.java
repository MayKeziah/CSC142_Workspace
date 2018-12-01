package abstraction;

public class AbstractClient {
	public static void main(String[] args) {
		AbstractShape shape;
		
		shape = new Circular(5.0);
		shape.setX(2);
		System.out.println(shape.toString());
		System.out.println("x: " 		 + shape.getX() + "\ny: " + shape.getY());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Radius: " 	 + ((Circular)shape).getRadius());	
		System.out.println();
		
		shape = new Rectangular(2.0, 4.0);
		System.out.println(shape.toString());
		System.out.println("x: " 		 + shape.getX() + "\ny: " + shape.getY());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println();	
		
		shape = new Triangular(6.0, 4.0, 10.0);
		System.out.println(shape.toString());
		System.out.println("x: " 		 + shape.getX() + "\ny: " + shape.getY());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println();
		/********************************************************************************************************************************
		 *  Question:	What  are  the differences in printing out the attributes 'area' and 'perimeter' with the abstract superclass
		 * 				reference versus a non-abstract superclass reference as described in Activity I?
		 *  Answer:		The non-abstract superclass required that I type-cast the 'shape' reference variable before using the area and
		 *  			perimeter methods. The Abstract superclass, on the other hand, did not need me to specify because each subclass
		 *  			could override the abstract methods in the Abstract superclass. 	
		 ********************************************************************************************************************************/

	}

}
