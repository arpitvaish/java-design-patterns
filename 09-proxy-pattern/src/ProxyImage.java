/**
 * VIRTUAL PROXY — stands in for RealImage. It's cheap to create because it
 * does NOT load the file. The real image is created lazily, on the first
 * display() call, and reused after that. Same interface, so the client
 * can't tell it's talking to a proxy.
 */
public class ProxyImage implements Image {
    private final String filename;
    private RealImage real;   // created only when first needed

    public ProxyImage(String filename) {
        this.filename = filename;   // cheap — no disk load here
    }

    @Override
    public void display() {
        if (real == null) {                 // lazy init on first use
            real = new RealImage(filename);
        }
        real.display();                     // then delegate to the real object
    }
}
