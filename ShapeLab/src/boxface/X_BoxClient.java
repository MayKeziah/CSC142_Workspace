package boxface;

public class X_BoxClient {

	public static void main(String[] args) {
		/************************************************************
		 * Question 1: shape.volume() see below
		 ************************************************************/
		Expandable box;
		box = new Box(4.0, 5.0, 8.0);
		System.out.println("toString: " + box.toString());
		System.out.println("Volume: " 	+ box.volume());

	}

}
