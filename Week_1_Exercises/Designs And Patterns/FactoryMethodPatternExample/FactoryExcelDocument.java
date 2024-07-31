package FactoryMethodPatternExample;

public class FactoryExcelDocument extends DocumentFactory{
    @Override
    public void createDocument() {
        System.out.println("FactoryExcelDocument is displayed");
    }
}
