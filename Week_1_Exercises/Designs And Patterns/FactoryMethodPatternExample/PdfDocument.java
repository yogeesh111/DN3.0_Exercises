package FactoryMethodPatternExample;

public class PdfDocument implements Document{

    @Override
    public void display() {
        System.out.println("PdfDocument display method");
    }
}
