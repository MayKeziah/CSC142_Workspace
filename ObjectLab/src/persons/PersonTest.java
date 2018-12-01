package persons;

public class PersonTest {
	public static void main(String[] args) {
		Person myself = new Person("Keziah", 24);
		Student zeroOneFive = new Student(myself, 3.8);
		System.out.println("Student Name: " + zeroOneFive.getPerson().getName());
		System.out.println("Student Age: " + zeroOneFive.getPerson().getAge());
		System.out.println("Student GPA: " + zeroOneFive.getGPA());
	}

}