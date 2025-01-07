import javax.management.MBeanInfo;

//Client code
public class Client {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();

        // In general, setting of compression strategy is done by a policy class
        // other than client
        context.setCompressionStrategy(new RarCompressionStrategy());
        context.createArchive("XXX.txt");

        // at run-time we can change the strategy according to the needs
        context.setCompressionStrategy(new ZipCompressionStrategy());
        context.createArchive("YY.txt");
    }
}