//Client code
public class Test {
	public static void main(String[] args) {
		Graphic[] graphicObjects = new Graphic[3];

		graphicObjects[0] = new Line("line 1");
		graphicObjects[1] = new Circle("circle 1");

		Picture p1 = new Picture("picture 1");
		p1.add(new Line("l1"));
		p1.add(new Circle("c1"));
		p1.add(new Line("l2"));

		Picture p2 = new Picture("p2");
		p2.add(new Line("l3"));

		Picture p3 = new Picture("p3");
		p3.add(new Line("l4"));
		p3.add(new Circle("c2"));

		p2.add(p3);
		p1.add(p2);

		graphicObjects[2] = p1;

		for (int i = 0; i < graphicObjects.length; i++) {
			graphicObjects[i].draw();
			System.out.println();
		}
	}
}