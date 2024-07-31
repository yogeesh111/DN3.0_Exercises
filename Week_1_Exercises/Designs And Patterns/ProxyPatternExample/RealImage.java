package ProxyPatternExample;

public class RealImage implements Image {

    private String source;

    public RealImage(String source) {
        this.source = source;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading " +source+ " from remote server");
    }

    @Override
    public void display() {

    }
}
