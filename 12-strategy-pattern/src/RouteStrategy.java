/**
 * STRATEGY interface — one job, many interchangeable algorithms.
 * Each concrete strategy computes a route a different way.
 */
public interface RouteStrategy {
    void buildRoute(String from, String to);
}
