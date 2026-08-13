/** When PLAYING: play does nothing new; pause suspends; stop halts. */
public class PlayingState implements State {
    @Override public void pressPlay(MediaPlayer p) {
        System.out.println("… already playing");
    }
    @Override public void pressPause(MediaPlayer p) {
        System.out.println("⏸ Pausing → PAUSED");
        p.setState(new PausedState());
    }
    @Override public void pressStop(MediaPlayer p) {
        System.out.println("⏹ Stopping → STOPPED");
        p.setState(new StoppedState());
    }
}
