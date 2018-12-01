package studyExercises;

import java.util.Scanner;

public class BMI_Calculator1016 {

	public static void main(String[] args) {
		//Age, gender, height (meters), weight (kg) -> healthy BMI vs. BMI
		//Calculate BMI
		//Compare to ideal BMI for body type
		Scanner keyboard  = new Scanner(System.in);
		System.out.println(" ----- This program takes your information and calculates your BMI ----- ");
		System.out.print("What is your name? ");
		String name = keyboard.next();
		double BMI = calcBMI(keyboard);
		System.out.println(name + ", you are " + compareBMI(BMI));
		System.out.println(" ----- ----- ----- ----- ----- ----------- ----- ----- ----- ----- ----- ");
		
		keyboard.close();

	}
	public static double calcBMI(Scanner input) {
		System.out.print("Please enter your height in meters (m = cm/100): ");
		double height = input.nextDouble();
		System.out.print("Please enter your weight in killograms: ");
		double weight = input.nextDouble();
		double BMI = weight / (height * height);
		
		return BMI;
	}
	
	public static String compareBMI(double BMI) {
		/*System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		String gender = input.next(); 
		if ((gender == "F") || (gender == "f")) {
		}*/
		String stringBMI;
		if (BMI < 18.5) {
			stringBMI = ("underweight. Lets look into your appetite.");
		}
		else if (BMI < 25) {
			stringBMI = ("a normal weight. Keep up the good work.");
		}
		else if (BMI < 30) {
			stringBMI = ("overweight. Lets look at your eating and fitness habits.");
		}
		else {
			stringBMI = ("obese. We need to change your routine.");
		}
		return stringBMI;
	}

}
