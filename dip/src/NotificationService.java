import java.util.HashMap;
import java.util.Map;

public class NotificationService implements INotificationService {

    private final Map<Integer, IMessageSender> senders;

    public NotificationService() {
        senders = new HashMap<>();
        senders.put(1, new EmailSender());
        senders.put(2, new SmsSender());
        senders.put(3, new PushNotificationSender());
    }

    @Override
    public void envoyer(String message, int choix) {
        IMessageSender sender = senders.get(choix);
        if (sender != null) {
            sender.send(message);
        } else {
            System.out.println("Choix invalide");
        }
    }
}
