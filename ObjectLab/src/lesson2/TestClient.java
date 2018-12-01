package lesson2;

public class TestClient {
	public static void main(String[] args) {
		/*Point p1 = new Point(1, 3);
		Point p2 = new Point(4, 7);
		Point result = p1.add(p2);
		Point result2 = p2.add(p1);
		Point p3 = new Point(3, 8);
		Point p4 = new Point(2, 7);
		
		System.out.println("x: " + p1.getX());
		System.out.println("y: " + p1.getY());
		System.out.println();
		System.out.println("x: " + p2.getX());
		System.out.println("y: " + p2.getY());
		System.out.println();
		System.out.println("x: " + result.getX());
		System.out.println("y: " + result.getY());
		System.out.println();		
		System.out.println("x: " + result2.getX());
		System.out.println("y: " + result2.getY());
		p3.swap(p4);
		System.out.println("x: " + p3.getX());
		System.out.println("y: " + p3.getY());
		System.out.println();		
		System.out.println("x: " + p4.getX());
		System.out.println("y: " + p4.getY());*/
		Line line1 = new Line(2, 7, 3, 8);
		Line line2 = new Line(4, 5, 5, 8);
		Line line1n2 = line1.add(line1, line2);
		System.out.println(line1.toString());
		System.out.println(line1n2.toString());
		System.out.println("" + line1.getSlope());
		System.out.println("" + line2.getSlope());
		System.out.println("" + line1n2.getSlope());
		Line flatLine = new Line(0, 0, 0, 1);
		System.out.println(flatLine.getSlope());

}

}
