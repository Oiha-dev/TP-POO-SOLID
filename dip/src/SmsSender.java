public class SmsSender implements IMessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}
