public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("🚶 Walking route " + from + " → " + to
                + ": footpaths + shortcuts, ~1 hr 40 min");
    }
}
