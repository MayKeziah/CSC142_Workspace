package people;

public class PeopleClient {
	public static void main(String[] args) {
		Student finn  = new Student("Finnegan Wolf", 19, Status.SOPHOMORE, 3.3);
		Student aeth  = new Student("Aethelfeld Eastwick", 0, Status.JUNIOR, 3.6);
		Employee jess = new Employee("Jessica Lemon", 37, "STEM 207", 52125.00);
		Employee mich = new Employee("Michael Wang", 45, "STEM 312", 55075.00);
		System.out.println(finn.toString());
		System.out.println(aeth.toString());
		System.out.println(jess.toString());
		System.out.println(mich.toString());
	}
}