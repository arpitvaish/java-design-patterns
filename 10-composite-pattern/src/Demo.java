/**
 * Demo: build a file tree and treat files and folders uniformly.
 * getSize() and print() work the same whether you call them on a single
 * file or on the whole root folder — that's the Composite payoff.
 */
public class Demo {
    public static void main(String[] args) {
        Folder root = new Folder("project");

        Folder src = new Folder("src");
        src.add(new FileItem("Main.java", 12))
           .add(new FileItem("Utils.java", 8));

        Folder assets = new Folder("assets");
        Folder images = new Folder("images");
        images.add(new FileItem("logo.png", 240))
              .add(new FileItem("banner.jpg", 512));
        assets.add(images)
              .add(new FileItem("styles.css", 20));

        root.add(src)
            .add(assets)
            .add(new FileItem("README.md", 4));

        System.out.println("=== Tree ===");
        root.print("");

        System.out.println("\n=== Uniform treatment ===");
        FileSystemItem oneFile = new FileItem("notes.txt", 3);
        FileSystemItem wholeTree = root;
        // Same call on a leaf and on a whole tree:
        System.out.println("Single file size: " + oneFile.getSize() + " KB");
        System.out.println("Whole tree size:  " + wholeTree.getSize() + " KB");
    }
}
