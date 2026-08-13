/**
 * CONTEXT — holds the current State and delegates every button press to it.
 * The player has NO if/else about what mode it's in; the current state
 * object handles the behavior and swaps in the next state.
 */
public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        this.state = new StoppedState();   // start stopped
        System.out.println("Player created → STOPPED");
    }

    public void setState(State state) { this.state = state; }

    // Buttons just delegate to the current state.
    public void pressPlay()  { state.pressPlay(this); }
    public void pressPause() { state.pressPause(this); }
    public void pressStop()  { state.pressStop(this); }
}
