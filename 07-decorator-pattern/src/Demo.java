/**
 * Demo: start with plain coffee, then wrap it in decorators.
 * Each wrap adds behavior WITHOUT a new subclass per combination.
 */
public class Demo {
    public static void main(String[] args) {
        Coffee order = new SimpleCoffee();
        print(order);

        // Wrap it: coffee + milk
        order = new MilkDecorator(order);
        print(order);

        // Wrap again: coffee + milk + sugar
        order = new SugarDecorator(order);
        print(order);

        // A fully loaded order, built in one expression:
        Coffee fancy = new WhipDecorator(
                            new SugarDecorator(
                                new MilkDecorator(
                                    new SimpleCoffee())));
        System.out.println("\nFully loaded:");
        print(fancy);
    }

    static void print(Coffee c) {
        System.out.printf("%-28s $%.2f%n", c.description(), c.cost());
    }
}
