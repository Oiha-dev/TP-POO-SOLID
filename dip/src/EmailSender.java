public class EmailSender implements IMessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email envoyé : " + message);
    }
}
