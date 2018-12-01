package first;

public class Unary {

	public static void main(String[] args) {
		int x = 1;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		
		int w = 1;
		int y = 2;
		double z = 2.0;
		z = (double)(2*w+3*y);
		System.out.println(z);
		
		float number = 8.0F; //declaring a variable of type float
		System.out.println("number: " + number);
		number = (float) 17.55; //type-cast double into float
		System.out.println("number: " + number);

				

	}

}
