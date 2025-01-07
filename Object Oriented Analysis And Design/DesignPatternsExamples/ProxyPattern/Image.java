public abstract class Image {
    protected String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    public abstract void display();
}