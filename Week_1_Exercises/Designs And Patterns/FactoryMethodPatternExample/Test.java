package FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args) {

        FactoryExcelDocument obj1=new FactoryExcelDocument();
        obj1.createDocument();
        FactoryPdfDocument obj2=new FactoryPdfDocument();
        obj2.createDocument();
        FactoryWordDocument obj3=new FactoryWordDocument();
        obj3.createDocument();
    }
}
