/** Adds milk: takes whatever's inside and adds to its description and cost. */
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee inner) { super(inner); }

    @Override public String description() { return inner.description() + " + Milk"; }
    @Override public double cost()        { return inner.cost() + 0.50; }
}
