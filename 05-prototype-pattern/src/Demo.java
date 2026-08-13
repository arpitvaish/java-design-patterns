/**
 * Demo: register templates once, then stamp out independent copies.
 * Proves that editing a clone does NOT touch the original (deep copy works).
 */
public class Demo {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        Circle baseCircle = new Circle(0, 0, 10, "red");
        baseCircle.addTag("template");
        registry.register("red-circle", baseCircle);
        registry.register("box", new Rectangle(4, 2, "blue"));

        System.out.println("=== Clone and customize ===");
        Circle c1 = (Circle) registry.get("red-circle");
        c1.setColor("green");
        c1.addTag("player-1");

        Circle c2 = (Circle) registry.get("red-circle");
        c2.addTag("player-2");

        c1.draw();   // green, tags=[template, player-1]
        c2.draw();   // red,   tags=[template, player-2]

        System.out.println("\n=== Original template is untouched ===");
        baseCircle.draw();  // still red, tags=[template]  → deep copy proven

        System.out.println("\n=== Another prototype ===");
        registry.get("box").draw();
    }
}
