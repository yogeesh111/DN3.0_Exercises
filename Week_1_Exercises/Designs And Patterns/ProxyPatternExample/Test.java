package ProxyPatternExample;

public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("Image1");
        Image image2 = new ProxyImage("Image2");
        image1.display();
        System.out.println();
        image1.display();
        System.out.println();
        image2.display();
        System.out.println();
        image2.display();
    }
}
