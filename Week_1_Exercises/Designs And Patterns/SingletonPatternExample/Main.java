package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        Logger val1=Logger.getInstance();
        Logger val2=Logger.getInstance();
        System.out.println(val1.equals(val2));

    }
}
