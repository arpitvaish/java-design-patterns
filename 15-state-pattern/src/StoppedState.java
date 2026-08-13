/** When STOPPED: play starts playback; pause/stop do nothing meaningful. */
public class StoppedState implements State {
    @Override public void pressPlay(MediaPlayer p) {
        System.out.println("▶ Starting playback → PLAYING");
        p.setState(new PlayingState());
    }
    @Override public void pressPause(MediaPlayer p) {
        System.out.println("… already stopped, nothing to pause");
    }
    @Override public void pressStop(MediaPlayer p) {
        System.out.println("… already stopped");
    }
}
