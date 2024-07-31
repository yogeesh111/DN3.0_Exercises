package DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier{
    Notifier reference;

    public NotifierDecorator(Notifier reference) {
        this.reference = reference;
    }

    public void send(String message) {
        reference.send(message);
    }
}
