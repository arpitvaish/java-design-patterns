/**
 * A LEAF — has no children. It just knows its own size.
 */
public class FileItem implements FileSystemItem {
    private final String name;
    private final int sizeKb;

    public FileItem(String name, int sizeKb) {
        this.name = name;
        this.sizeKb = sizeKb;
    }

    @Override public String getName() { return name; }
    @Override public int getSize()    { return sizeKb; }

    @Override
    public void print(String indent) {
        System.out.println(indent + "📄 " + name + " (" + sizeKb + " KB)");
    }
}
