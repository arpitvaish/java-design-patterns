/**
 * Demo: subscribers come and go; the channel just broadcasts. Notice that
 * unsubscribing means that observer stops getting updates — no other code
 * changes.
 */
public class Demo {
    public static void main(String[] args) {
        Channel channel = new Channel("DesignPatternsTV");

        Subscriber alice = new EmailSubscriber("alice@mail.com");
        Subscriber bob   = new PushSubscriber("Bob's Pixel");
        Subscriber carol = new EmailSubscriber("carol@mail.com");

        channel.subscribe(alice);
        channel.subscribe(bob);
        channel.subscribe(carol);

        channel.uploadVideo("Observer Pattern Explained");  // all 3 notified

        System.out.println("\n-- Bob unsubscribes --");
        channel.unsubscribe(bob);

        channel.uploadVideo("Strategy Pattern Explained");   // only alice + carol
    }
}
