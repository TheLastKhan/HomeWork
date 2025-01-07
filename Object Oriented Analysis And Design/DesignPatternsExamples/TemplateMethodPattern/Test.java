public class Test {
    public static void main(String[] args) {
        DocumentProcessor pdfProcessor = new PDFProcessor();
        pdfProcessor.processDocument();

        System.out.println();

        DocumentProcessor wordProcessor = new WordProcessor();
        wordProcessor.processDocument();
    }
}