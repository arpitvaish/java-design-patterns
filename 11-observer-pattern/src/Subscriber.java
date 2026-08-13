/** OBSERVER interface — anything that wants to be notified implements this. */
public interface Subscriber {
    void update(String channelName, String videoTitle);
}
