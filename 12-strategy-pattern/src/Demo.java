/**
 * Demo: the user taps different travel modes; we just swap the strategy.
 * No giant switch statement, no touching Navigator — new modes plug in.
 */
public class Demo {
    public static void main(String[] args) {
        Navigator nav = new Navigator(new DrivingStrategy());
        nav.navigate("Home", "Airport");

        System.out.println("\nUser taps 'Walk':");
        nav.setStrategy(new WalkingStrategy());
        nav.navigate("Home", "Airport");

        System.out.println("\nUser taps 'Bike':");
        nav.setStrategy(new CyclingStrategy());
        nav.navigate("Home", "Airport");
    }
}
