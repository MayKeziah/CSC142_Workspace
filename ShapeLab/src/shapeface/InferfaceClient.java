package shapeface;

public class InferfaceClient {
	public static void main(String[] args) {
		Shapeable shape;
		
		shape = new Circular(5.0);
		System.out.println(shape.toString());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		System.out.println("Radius: "	 + ((Circular)shape).getRadius());
		shape.quadruple();
		System.out.println(shape.toString());
		System.out.println();
		
		shape = new Rectangular(2.0, 4.0);
		System.out.println(shape.toString());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		shape.quadruple();
		System.out.println(shape.toString());
		System.out.println();	
		
		shape = new Triangular(6.0, 4.0, 10.0);
		System.out.println(shape.toString());
		System.out.println("Area: " 	 + shape.area());
		System.out.println("Perimeter: " + shape.perimeter());
		shape.quadruple();
		System.out.println(shape.toString());
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
