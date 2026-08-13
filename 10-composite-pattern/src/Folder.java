import java.util.ArrayList;
import java.util.List;

/**
 * A COMPOSITE — contains children, each of which is itself a FileSystemItem
 * (a FileItem OR another Folder). Its size is the sum of its children's
 * sizes, computed by delegating to each child — recursion handles any depth.
 */
public class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) { this.name = name; }

    public Folder add(FileSystemItem item) {   // returns this for easy chaining
        children.add(item);
        return this;
    }

    @Override public String getName() { return name; }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemItem child : children) {
            total += child.getSize();   // works whether child is a file or a folder
        }
        return total;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "📁 " + name + "/ (" + getSize() + " KB total)");
        for (FileSystemItem child : children) {
            child.print(indent + "   ");
        }
    }
}
