//Leaf class
public class Line extends Graphic {

	public Line(String name) {
		super(name);
	}

	public void draw() {
		System.out.println("Drawing a line: " + name);
	}
}
