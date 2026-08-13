public class CyclingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("🚴 Cycling route " + from + " → " + to
                + ": bike lanes, avoid highways, ~40 min");
    }
}
