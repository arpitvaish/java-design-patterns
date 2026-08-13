/**
 * PROTECTION PROXY — same interface, but it guards access. Only an admin
 * may display the image; everyone else is refused. The real object stays
 * completely unaware that access control is happening.
 */
public class AccessControlledImage implements Image {
    private final Image real;
    private final String role;

    public AccessControlledImage(Image real, String role) {
        this.real = real;
        this.role = role;
    }

    @Override
    public void display() {
        if (!"admin".equals(role)) {
            System.out.println("  [Proxy] ACCESS DENIED for role '" + role + "'");
            return;
        }
        real.display();
    }
}
