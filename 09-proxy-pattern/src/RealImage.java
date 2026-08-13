/**
 * The REAL object — expensive to create because it "loads" a big file from
 * disk in its constructor. We want to avoid paying that cost until needed.
 */
public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();   // expensive work happens on creation
    }

    private void loadFromDisk() {
        System.out.println("  [RealImage] loading '" + filename + "' from disk... (expensive)");
    }

    @Override
    public void display() {
        System.out.println("  [RealImage] displaying '" + filename + "'");
    }
}
