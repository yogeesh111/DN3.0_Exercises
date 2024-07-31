package AdapterPatternExample;

public class PhonePayAdapter implements PaymentProcessor{
    private PhonePayGateWay phonepay;

    public PhonePayAdapter(PhonePayGateWay phonepay) {
        this.phonepay = phonepay;
    }

    @Override
    public void processPayment(double amt) {
        phonepay.pay(amt);
    }
}
