/**
 * The Factory. Callers ask for a channel by name and get back a ready
 * Notification — they never call `new EmailNotification()` themselves.
 * Add a new channel here in ONE place; no caller code changes.
 */
public class NotificationFactory {

    public Notification create(String channel) {
        if (channel == null) {
            throw new IllegalArgumentException("channel is required");
        }
        switch (channel.toLowerCase()) {
            case "email": return new EmailNotification();
            case "sms":   return new SmsNotification();
            case "push":  return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}
