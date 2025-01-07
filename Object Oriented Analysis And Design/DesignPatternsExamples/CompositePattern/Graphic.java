//Component class
public abstract class Graphic {
	protected String name;

	public Graphic(String name) {
		this.name = name;
	}

	public abstract void draw();
}
