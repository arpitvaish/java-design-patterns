/** Subsystem class — one of several the client would otherwise juggle. */
public class Amplifier {
    public void on()              { System.out.println("Amplifier: on"); }
    public void setSurroundSound(){ System.out.println("Amplifier: surround sound mode"); }
    public void setVolume(int v)  { System.out.println("Amplifier: volume = " + v); }
    public void off()             { System.out.println("Amplifier: off"); }
}
