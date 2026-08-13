/**
 * Demo: without the facade the client would run ~8 steps in the right order.
 * With it, two calls. Note the subsystems are still available directly if
 * a power user needs fine control — the facade doesn't hide them, it just
 * offers an easy default path.
 */
public class Demo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade(
                new Amplifier(), new Projector(), new StreamingBox(), new Lights());

        theater.watchMovie("Interstellar");

        System.out.println();
        theater.endMovie();
    }
}
