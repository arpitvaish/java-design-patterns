/** The concrete base component — plain coffee, no add-ons. */
public class SimpleCoffee implements Coffee {
    @Override public String description() { return "Coffee"; }
    @Override public double cost()        { return 2.00; }
}
