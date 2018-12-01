package boxface;

public class InterfaceClient {

	public static void main(String[] args) {
		Expandable box = new Box(2.0, 5.0, 10.0);
		System.out.println(box.toString());
		System.out.println("Volume: " + box.volume());

	}

}
