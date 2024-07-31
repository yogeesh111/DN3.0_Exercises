package FactoryMethodPatternExample;

public class WordDocument implements Document{

    @Override
    public void display() {
        System.out.println("WordDocument display method");
    }
}
