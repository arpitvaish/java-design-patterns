/**
 * FACADE — one simple door in front of four subsystems.
 * The client calls watchMovie()/endMovie() and never touches the
 * amplifier, projector, streaming box, or lights directly.
 */
public class HomeTheaterFacade {
    private final Amplifier amp;
    private final Projector projector;
    private final StreamingBox streaming;
    private final Lights lights;

    public HomeTheaterFacade(Amplifier amp, Projector projector,
                             StreamingBox streaming, Lights lights) {
        this.amp = amp;
        this.projector = projector;
        this.streaming = streaming;
        this.lights = lights;
    }

    /** The "MOVIE NIGHT" button — one call, correct order, every time. */
    public void watchMovie(String movie) {
        System.out.println(">>> Get ready to watch: " + movie);
        lights.dim(10);
        projector.on();
        projector.wideScreen();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(7);
        streaming.on();
        streaming.play(movie);
    }

    public void endMovie() {
        System.out.println(">>> Shutting the theater down");
        streaming.stop();
        streaming.off();
        amp.off();
        projector.off();
        lights.on();
    }
}
