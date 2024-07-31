package ProxyPatternExample;

public class ProxyImage implements Image{

    private String source;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.source = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(source);
        }
        realImage.display();
    }
}
