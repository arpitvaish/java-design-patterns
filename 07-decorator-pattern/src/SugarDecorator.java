public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee inner) { super(inner); }

    @Override public String description() { return inner.description() + " + Sugar"; }
    @Override public double cost()        { return inner.cost() + 0.25; }
}
