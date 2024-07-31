package AdapterPatternExample;

public class Test {
    public static void main(String[] args) {
        GpayAdapter gpay=new GpayAdapter(new GpayGateWay());
        gpay.processPayment(2000);
        PhonePayAdapter phonepay=new PhonePayAdapter(new PhonePayGateWay());
        phonepay.processPayment(3000);
    }
}
