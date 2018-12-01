package studyExercises;

import java.util.Scanner;

public class BabySitter1015 {

	public static void main(String[] args) {
		// create input streams (group types together)
		Scanner Keyboard;
		Keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = Keyboard.next();

		System.out.println(name + ", you make $" + calculations(Keyboard) + " in a week. Nice!");
		Keyboard.close();

	}

	public static double calculations(Scanner Keyboard) {
	//define input
		System.out.println("Enter how much you make an hour");
		double wage = Keyboard.nextDouble();
		System.out.println("Enter how many hours you work a day on average");
		double hoursPerDay = Keyboard.nextDouble();
		System.out.println("Enter how many days a week you work");
		int daysPerWeek = Keyboard.nextInt();
		//System.out.println("Enter how many hours after 9PM you worked this week");
		//double hoursAfterNine = Keyboard.nextDouble();
		System.out.println("What is the tax in your state? (enter as a decimal value ex: 10.1% = 0.101");
		double tax = 1 - Keyboard.nextDouble();
		
		double oneWeekCheck = (wage * hoursPerDay * daysPerWeek) * tax;
		return oneWeekCheck;
		
	}
}
