/**
 * The abstract decorator. It IS a Coffee and it HOLDS a Coffee.
 * That "is-a + has-a" pair is what lets decorators stack on each other.
 * By default it just delegates to the wrapped coffee; subclasses add extra.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee inner;   // the coffee we're wrapping

    protected CoffeeDecorator(Coffee inner) {
        this.inner = inner;
    }

    @Override public String description() { return inner.description(); }
    @Override public double cost()        { return inner.cost(); }
}
