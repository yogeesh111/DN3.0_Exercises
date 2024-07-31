package BuilderPatternExample;

public class Test {
    public static void main(String[] args) {
        Computer obj1=new Computer.Builder().setRam("16GB").setStorage("512SSD").setCpu("DualCore").build();
        System.out.println(obj1.getCpu()+" "+obj1.getRam()+" "+obj1.getStorage());
    }
}
