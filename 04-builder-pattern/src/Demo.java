/**
 * Demo: build different burgers with only the fields we care about.
 * No telescoping constructors, no boolean soup like new Burger(x, y, true, false, true, null).
 */
public class Demo {
    public static void main(String[] args) {
        Burger classic = new Burger.Builder("sesame", "beef")
                .cheese(true)
                .lettuce(true)
                .sauce("burger")
                .build();

        Burger plainVeg = new Burger.Builder("wheat", "veggie")
                .tomato(true)
                .build();

        Burger loaded = new Burger.Builder("brioche", "chicken")
                .cheese(true).lettuce(true).tomato(true).sauce("spicy mayo")
                .build();

        System.out.println("Classic : " + classic);
        System.out.println("PlainVeg: " + plainVeg);
        System.out.println("Loaded  : " + loaded);

        System.out.println("\nMissing a required field:");
        try {
            new Burger.Builder("plain", null).build();
        } catch (IllegalStateException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}
