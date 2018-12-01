package circle;

public class TestClient {

	public static void main(String[] args) {
		try {
			Circle circle1 = new Circle(2);
			Circle circle2 = new Circle(0);
			Circle circle3 = new Circle(-2);
			
			System.out.println(circle1.getRadius());
			System.out.println(circle2.getRadius());
			System.out.println(circle3.getRadius());
		
		}catch(IllegalArgumentException exception) {
			System.out.println(exception);
		}

	}

}
