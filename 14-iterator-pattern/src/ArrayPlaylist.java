/**
 * CONCRETE AGGREGATE — happens to store songs in a plain array. The client
 * never sees this array; it only uses the iterator. We could swap this for a
 * linked list or a tree and no client code would change.
 *
 * The iterator is a private inner class so it can read the array directly
 * while keeping that array hidden from the outside world.
 */
public class ArrayPlaylist implements Playlist {
    private Song[] songs = new Song[4];
    private int size = 0;

    @Override
    public void add(Song song) {
        if (size == songs.length) {                 // grow the array as needed
            Song[] bigger = new Song[songs.length * 2];
            System.arraycopy(songs, 0, bigger, 0, size);
            songs = bigger;
        }
        songs[size++] = song;
    }

    @Override
    public SongIterator iterator() {
        return new ArrayIterator();
    }

    // Iterator knows how THIS collection is stored; the client never does.
    private class ArrayIterator implements SongIterator {
        private int cursor = 0;

        @Override public boolean hasNext() { return cursor < size; }
        @Override public Song next()       { return songs[cursor++]; }
    }
}
