/** Another prototype — same idea, different shape. */
public class Rectangle implements Shape {
    private int width, height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width; this.height = height; this.color = color;
    }

    private Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
        this.color = other.color;
    }

    @Override
    public Shape cloneShape() { return new Rectangle(this); }

    public void setColor(String c) { this.color = c; }

    @Override
    public void draw() {
        System.out.println("Rectangle " + width + "x" + height + " " + color);
    }
}
