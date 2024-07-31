package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;


    public CreditCardPayment(String name, String cardNumber, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
