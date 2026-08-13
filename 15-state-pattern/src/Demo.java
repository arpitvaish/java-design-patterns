/**
 * Demo: the SAME button press does different things depending on the current
 * state — because the behavior lives in the state objects, not in the player.
 */
public class Demo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.pressPlay();   // STOPPED → PLAYING
        player.pressPause();  // PLAYING → PAUSED
        player.pressPlay();   // PAUSED  → PLAYING (resume)
        player.pressStop();   // PLAYING → STOPPED

        System.out.println("\nSame button, different state:");
        player.pressPause();  // STOPPED → nothing to pause
        player.pressPlay();   // STOPPED → PLAYING again
        player.pressPlay();   // PLAYING → already playing
    }
}
