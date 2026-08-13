/**
 * Demo: every beverage runs the SAME skeleton (boil → brew → pour → condiments),
 * but each fills in its own steps. The order is guaranteed identical.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        new Tea().prepareRecipe();

        System.out.println("Making coffee:");
        new Coffee().prepareRecipe();

        System.out.println("Making black coffee (hook skips condiments):");
        new BlackCoffee().prepareRecipe();
    }
}
