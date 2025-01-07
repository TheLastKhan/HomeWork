//Adapter class
public class Rectangle implements Shape {
	private LegacyRectangle adaptee;

	public Rectangle() {
		adaptee = new LegacyRectangle();
	}

	/**
	 * @param x1: Minimum x coordinate of the rectangle
	 * @param y1: Minimum y coordinate of the rectangle
	 * @param x2: Maximum x coordinate of the rectangle
	 * @param y2: Maximum y coordinate of the rectangle
	 */
	public void display(int x1, int y1, int x2, int y2) {
		adaptee.display(x1, y1, x2 - x1, y2 - y1);
	}
}