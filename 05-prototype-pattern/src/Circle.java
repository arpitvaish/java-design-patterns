import java.util.ArrayList;
import java.util.List;

/**
 * A concrete prototype. Note the copy constructor does a DEEP copy of the
 * mutable `tags` list — so a clone and its original never share state.
 */
public class Circle implements Shape {
    private int x, y, radius;
    private String color;
    private final List<String> tags;   // mutable → must be deep-copied

    public Circle(int x, int y, int radius, String color) {
        this.x = x; this.y = y; this.radius = radius; this.color = color;
        this.tags = new ArrayList<>();
    }

    // Copy constructor — the heart of a safe clone.
    private Circle(Circle other) {
        this.x = other.x;
        this.y = other.y;
        this.radius = other.radius;
        this.color = other.color;
        this.tags = new ArrayList<>(other.tags);   // NEW list, not the same reference
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }

    public void addTag(String tag) { tags.add(tag); }
    public void setColor(String c) { this.color = c; }

    @Override
    public void draw() {
        System.out.println("Circle r=" + radius + " at (" + x + "," + y + ") "
                + color + " tags=" + tags);
    }
}
