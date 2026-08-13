/** A simple element we'll iterate over. */
public class Song {
    private final String title;
    private final String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() { return title + " — " + artist; }
}
