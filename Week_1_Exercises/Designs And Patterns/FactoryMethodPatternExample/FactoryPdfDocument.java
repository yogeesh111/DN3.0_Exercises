package FactoryMethodPatternExample;

public class FactoryPdfDocument extends DocumentFactory{

    @Override
    public void createDocument() {
        System.out.println("FactoryPdfDocument is displayed");
    }
}
