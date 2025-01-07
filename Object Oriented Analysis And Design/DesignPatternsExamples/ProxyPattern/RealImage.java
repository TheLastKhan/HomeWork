public class RealImage extends Image {

    public RealImage(String fileName) {
        super(fileName);
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
}