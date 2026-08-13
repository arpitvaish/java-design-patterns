import java.util.ArrayList;
import java.util.List;

/**
 * SUBJECT (Observable) — keeps a list of subscribers and notifies them all
 * when something happens (a new video). It doesn't know or care WHO is
 * subscribed or WHAT they do with the notification — only that they
 * implement Subscriber. That loose coupling is the whole point.
 */
public class Channel {
    private final String name;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String name) { this.name = name; }

    public void subscribe(Subscriber s)   { subscribers.add(s); }
    public void unsubscribe(Subscriber s) { subscribers.remove(s); }

    public void uploadVideo(String title) {
        System.out.println("\n" + name + " uploaded: '" + title + "'");
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (Subscriber s : subscribers) {   // push the event to everyone
            s.update(name, title);
        }
    }
}
