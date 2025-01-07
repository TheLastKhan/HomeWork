//Concrete strategy
public class ZipCompressionStrategy implements CompressionStrategy {
    public void compressFile(String filename) {
        // compress file according to zip strategy
        System.out.println("The file is compressed by ZIP compression.");
    }
}