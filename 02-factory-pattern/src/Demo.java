/**
 * Demo: the client only knows the factory and the Notification interface.
 * It has no idea which concrete class it's using — that's the whole point.
 */
public class Demo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        String[] channels = {"email", "sms", "push"};
        for (String channel : channels) {
            Notification n = factory.create(channel);   // no `new Xxx()` here
            n.send("Your order #1234 has shipped!");
        }

        System.out.println("\nTry an unknown channel:");
        try {
            factory.create("carrier-pigeon");
        } catch (IllegalArgumentException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}
