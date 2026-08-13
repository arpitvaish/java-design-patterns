public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee inner) { super(inner); }

    @Override public String description() { return inner.description() + " + Whip"; }
    @Override public double cost()        { return inner.cost() + 0.75; }
}
