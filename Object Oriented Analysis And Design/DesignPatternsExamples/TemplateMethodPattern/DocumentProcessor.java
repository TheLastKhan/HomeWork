public abstract class DocumentProcessor {
    // Template Method
    public final void processDocument() {
        openDocument();
        parseContent();
        saveDocument();
    }

    // Concrete methods
    private void openDocument() {
        System.out.println("Opening the document...");
    }

    private void saveDocument() {
        System.out.println("Saving the document...");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void parseContent();
}