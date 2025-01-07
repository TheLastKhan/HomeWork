public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be loaded from disk
        System.out.println("First call to display:");
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        System.out.println("Second call to display:");
        image.display();
    }
}