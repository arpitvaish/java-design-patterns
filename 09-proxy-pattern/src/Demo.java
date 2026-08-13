/**
 * Demo: the virtual proxy defers the expensive load until first display,
 * and the protection proxy blocks unauthorized access — both behind the
 * exact same Image interface the client already uses.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Virtual Proxy (lazy loading) ===");
        Image photo = new ProxyImage("vacation-4k.png");
        System.out.println("Proxy created — notice NOTHING loaded yet.");

        System.out.println("First display() -> triggers the load:");
        photo.display();

        System.out.println("Second display() -> reuses the loaded image:");
        photo.display();   // no second "loading from disk"

        System.out.println("\n=== Protection Proxy (access control) ===");
        Image adminView = new AccessControlledImage(new ProxyImage("secret.png"), "admin");
        Image guestView = new AccessControlledImage(new ProxyImage("secret.png"), "guest");
        System.out.println("As admin:");
        adminView.display();
        System.out.println("As guest:");
        guestView.display();
    }
}
