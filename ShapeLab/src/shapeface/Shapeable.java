package shapeface;

public interface Shapeable {
	//You can completely delete "public" and "abstract" because they are implied.
	public abstract double area(); //Takes no parameters, returns a double that is the perimeter of this shape.
	double perimeter(); //Takes no parameters, returns a double that is the perimeter of this shape.
	double quadruple(); //Takes no parameters, returns this shapes (Datafields added together) and then multiplied by 4.
}
