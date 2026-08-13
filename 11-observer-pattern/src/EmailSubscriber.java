/** A concrete observer that reacts by "sending an email". */
public class EmailSubscriber implements Subscriber {
    private final String email;
    public EmailSubscriber(String email) { this.email = email; }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("  📧 Email to " + email + ": " + channelName
                + " posted '" + videoTitle + "'");
    }
}
