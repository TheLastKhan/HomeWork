import java.util.ArrayList;

//Context file
public class CompressionContext {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(String file) {
        strategy.compressFile(file);
    }

}