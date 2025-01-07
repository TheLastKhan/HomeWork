//Concrete strategy
public class RarCompressionStrategy implements CompressionStrategy {
    public void compressFile(String filename) {
        // compress file according to rar strategy
        System.out.println("The file is compressed by RAR compression.");
    }
}