package quotient;

import java.util.Scanner;

public class QuotientClient {

	/*************************************************************
	 * method: quotient
	 *         throws an exception that matches its caller method
	 *************************************************************/
	public static int quotient(int num, int denom) throws ArithmeticException {
		
		/****************************************************
		 * validate: denom
		 *           throws an exception if dividing by zero
		 ****************************************************/
		if (denom == 0) {
			throw new ArithmeticException("Illegal operation: Division by zero");
		}
		
		return num/denom;
	}
	
	/********************************************
	 * start: main
	 *        program is run from this method
	 ********************************************/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/****************************************************
		 * prompt: input
		 *         prompt user to enter  two integers
		 ****************************************************/
		System.out.println("Enter integer numerator and denominator");
		int num   = input.nextInt();
		int denom = input.nextInt();
		
		try {
			int result = quotient(num, denom);
			System.out.println(num + " / " + denom + " = " + result );
			
		}catch(ArithmeticException exception) {			
			System.out.println(exception);		}
		
		System.out.println("execution continues...");
		input.close();
	}

}
