public class DrivingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("🚗 Driving route " + from + " → " + to
                + ": fastest roads, ~25 min");
    }
}
