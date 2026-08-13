/** When PAUSED: play resumes; pause does nothing; stop halts. */
public class PausedState implements State {
    @Override public void pressPlay(MediaPlayer p) {
        System.out.println("▶ Resuming → PLAYING");
        p.setState(new PlayingState());
    }
    @Override public void pressPause(MediaPlayer p) {
        System.out.println("… already paused");
    }
    @Override public void pressStop(MediaPlayer p) {
        System.out.println("⏹ Stopping → STOPPED");
        p.setState(new StoppedState());
    }
}
