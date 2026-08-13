/**
 * The COMPONENT — the common interface for both leaves (File) and
 * composites (Folder). The client treats everything as a FileSystemItem,
 * so a single file and a whole folder tree are used the same way.
 */
public interface FileSystemItem {
    String getName();
    int getSize();               // in KB
    void print(String indent);   // show this item (and its children, if any)
}
