/** The product interface — every notification type implements this. */
public interface Notification {
    void send(String message);
}
