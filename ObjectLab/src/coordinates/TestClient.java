package coordinates;

public class TestClient {
	public static void main(String[] args) {
		Point p1 = new Point(1, 3);
		Point p2 = new Point(4, 7);
		Point result = p1.add(p2);
		Point result2 = p2.add(p1);
		Point p3 = new Point(3, 8);
		Point p4 = new Point(2, 7);
		
		System.out.println("x: " + p1.x);
		System.out.println("y: " + p1.y);
		System.out.println();
		System.out.println("x: " + p2.x);
		System.out.println("y: " + p2.y);
		System.out.println();
		System.out.println("x: " + result.x);
		System.out.println("y: " + result.y);
		System.out.println();		
		System.out.println("x: " + result2.x);
		System.out.println("y: " + result2.y);
		p3.swap(p4);
		System.out.println("x: " + p3.x);
		System.out.println("y: " + p3.y);
		System.out.println();		
		System.out.println("x: " + p4.x);
		System.out.println("y: " + p4.y);
		
	}

}
