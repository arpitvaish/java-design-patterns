/**
 * CONTEXT — holds a strategy and delegates the work to it. The Navigator
 * doesn't know HOW any route is built; it just calls the current strategy.
 * Swap the strategy at runtime and the behavior changes with zero if/else.
 */
public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Change the algorithm on the fly.
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String from, String to) {
        strategy.buildRoute(from, to);   // delegate to whichever strategy is set
    }
}
