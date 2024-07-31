package StrategyPatternExample;

public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        PaymentStrategy creditCardPayment = new CreditCardPayment("yogeesh", "098709871234", "991");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(200);
        PaymentStrategy payPalPayment = new PayPalPayment("yogeesh@gmail.com", "12345");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(400);
    }
}
