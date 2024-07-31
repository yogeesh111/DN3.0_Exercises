package FactoryMethodPatternExample;

public class ExcelDocument implements Document{

    @Override
    public void display() {
        System.out.println("ExcelDocument display method");
    }
}
