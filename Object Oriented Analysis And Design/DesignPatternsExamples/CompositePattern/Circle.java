//Leaf class
public class Circle extends Graphic {

	public Circle(String name) {
		super(name);
	}

	public void draw() {
		System.out.println("Drawing a circle: " + name);
	}
}