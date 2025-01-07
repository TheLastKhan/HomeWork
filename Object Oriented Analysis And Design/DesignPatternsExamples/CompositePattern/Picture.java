
//Composite class
import java.util.ArrayList;

public class Picture extends Graphic {
	ArrayList<Graphic> children;

	public Picture(String name) {
		super(name);
		children = new ArrayList<Graphic>();
	}

	public void draw() {
		System.out.println("Drawing a picture: " + name);
		for (int i = 0; i < children.size(); i++)
			getChild(i).draw();
	}

	public void add(Graphic g) {
		children.add(g);
	}

	public void remove(int i) {
		children.remove(i);
	}

	public Graphic getChild(int i) {
		return children.get(i);
	}
}