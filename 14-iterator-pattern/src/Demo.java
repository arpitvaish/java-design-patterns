/**
 * Demo: the client walks the playlist using only hasNext()/next(). It has no
 * idea the songs live in an array — that's the point. Same loop would work
 * over a linked list, a tree, or a database cursor.
 */
public class Demo {
    public static void main(String[] args) {
        Playlist playlist = new ArrayPlaylist();
        playlist.add(new Song("Bohemian Rhapsody", "Queen"));
        playlist.add(new Song("Hotel California", "Eagles"));
        playlist.add(new Song("Smells Like Teen Spirit", "Nirvana"));
        playlist.add(new Song("Billie Jean", "Michael Jackson"));
        playlist.add(new Song("Lose Yourself", "Eminem"));   // forces array to grow

        System.out.println("=== Now playing the whole playlist ===");
        SongIterator it = playlist.iterator();
        int track = 1;
        while (it.hasNext()) {
            System.out.println(track++ + ". " + it.next());
        }

        System.out.println("\nTwo independent iterators don't interfere:");
        SongIterator a = playlist.iterator();
        SongIterator b = playlist.iterator();
        System.out.println("A first: " + a.next());
        System.out.println("B first: " + b.next());   // both start fresh
        System.out.println("A second: " + a.next());
    }
}
