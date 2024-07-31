package FactoryMethodPatternExample;

public class FactoryWordDocument extends DocumentFactory{

    @Override
    public  void createDocument() {
        System.out.println("FactoryWordDocument is displayed");
    }
}
