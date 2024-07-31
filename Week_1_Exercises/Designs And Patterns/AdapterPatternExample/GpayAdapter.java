package AdapterPatternExample;

public class GpayAdapter implements PaymentProcessor {
    private GpayGateWay gpay;

    public GpayAdapter(GpayGateWay gpay) {
        this.gpay = gpay;
    }

    @Override
    public void processPayment(double amt) {
        gpay.pay(amt);
    }
}
