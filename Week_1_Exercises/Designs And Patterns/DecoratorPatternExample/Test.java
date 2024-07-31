package DecoratorPatternExample;

public class Test {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        String message = "Notification sent";
        slackNotifier.send(message);
    }
}
