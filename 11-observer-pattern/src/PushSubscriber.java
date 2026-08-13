/** Another concrete observer — reacts differently to the same event. */
public class PushSubscriber implements Subscriber {
    private final String device;
    public PushSubscriber(String device) { this.device = device; }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("  🔔 Push to " + device + ": New from " + channelName + "!");
    }
}
