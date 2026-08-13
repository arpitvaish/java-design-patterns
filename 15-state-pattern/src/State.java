/**
 * STATE interface — each state decides what the player does for each button,
 * AND which state to move to next. Behavior + transitions live in the states,
 * not in a giant if/else in the player.
 */
public interface State {
    void pressPlay(MediaPlayer player);
    void pressPause(MediaPlayer player);
    void pressStop(MediaPlayer player);
}
