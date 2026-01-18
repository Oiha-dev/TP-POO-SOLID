public class PushNotificationSender implements IMessageSender {
    @Override
    public void send(String message) {
        System.out.println("Notification push envoyée : " + message);
    }
}
